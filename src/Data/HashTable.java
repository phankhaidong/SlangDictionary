/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Admin
 */
class HashNode{
    String key;
    String value;
    int hashCode;
    public HashNode(String key, String value, int hashCode)
    {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

public class HashTable{
    private ArrayList<ArrayList<HashNode>> bucketArray;
    private int numBuckets;
    private int size;
    public HashTable(){
        bucketArray = new ArrayList<>();
        numBuckets = 20000;
        size = 0;
        for(int i=0;i<numBuckets;i++){
            bucketArray.add(null);
        }
    }
    
    public int size(){return size;}
    public boolean isEmpty(){return size()==0;}
    
    private final int hashCode(String key){
        return Objects.hashCode(key);
    }
    
    private int getBucketIndex(String key){
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        index = index < 0 ? index * -1:index;
        return index;
    }
    
    public void removeMeaning(String key,String value){
        int bucketIndex = getBucketIndex(key);
        //int hashCode = hashCode(key);
        if (bucketArray.get(bucketIndex)!=null){
            for(HashNode item:bucketArray.get(bucketIndex)){
                if(item.value == value){
                    bucketArray.get(bucketIndex).remove(item);
                    return;
                }
            }
        }
    }
    
    public void removeSlang(String key){
        int bucketIndex = getBucketIndex(key);
        bucketArray.remove(bucketIndex);        
    }
    
    public ArrayList<HashNode> get (String key){
        ArrayList<HashNode> result = new ArrayList();
        int bucketIndex = getBucketIndex(key);
        //int hashCode = hashCode(key);
        
        result = bucketArray.get(bucketIndex);
        
        return result;
    }
    
    public boolean add(String key, String value,boolean flag)
    {
        // Find head of chain for given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        
        ArrayList<HashNode> meaningArray = bucketArray.get(bucketIndex);
        HashNode tempNode = new HashNode(key,value,hashCode);
        System.out.println("Add "+key+" "+value+" "+bucketIndex);        
        if(meaningArray == null){
            if(flag ==true){
        
            meaningArray = new ArrayList<>();
            meaningArray.add(tempNode);
            bucketArray.add(bucketIndex, meaningArray);
            System.out.println(bucketArray.get(bucketIndex).get(0).value);
            }
        }
        else{
            if(flag == false){
                if (meaningArray.contains(tempNode)==false){
                    meaningArray.add(tempNode);
                    System.out.println(bucketArray.get(bucketIndex).get(1).value+" "+bucketIndex);
                    return true;
            }
        }
            }
        size++;
        
        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * size) / numBuckets >= 0.7) {
            //FIX HERE
            ArrayList<ArrayList<HashNode>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets *=2;
            size =0;
            for(int i=0;i<numBuckets;i++){
                bucketArray.add(null);
            }
            int index;
            for(int i=0;i<temp.size();i++){
                index = temp.get(i).get(0).hashCode;
                bucketArray.add(index, temp.get(i));
            }
        }
        return true;
    }
    
    public boolean ReadFile(String src){
        try{
            FileReader fr = new FileReader(src);
            BufferedReader br = new BufferedReader(fr);
            String slang, definition;
            String[] split;
            int n =0;
            String def;
            br.readLine();
            while((def=br.readLine())!=null){
                n++;
                split = def.split("`");
                String[] meaning = split[1].split("\\|");
                for(String item: meaning){
                    add(split[0],item,false);
                }
            }
            br.close();
            return true;
        }
        catch(IOException ioe){
            return false;
        }
    }
    
     public static void main(String[] args)
    {
        HashTable map = new HashTable();
        map.ReadFile("slang.txt");
        System.out.println(map.size());
        
        
    }
}

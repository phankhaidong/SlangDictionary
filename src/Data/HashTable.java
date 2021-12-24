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
    public String getKey(){
        return key;
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
    
    public String getRandomSlang(){
        String randomSlang=null;
        while(randomSlang==null){
            Random random = new Random();
            int num = random.nextInt(size - 0) + 0;
            if(bucketArray.get(num)!=null){
                randomSlang = bucketArray.get(num).get(0).key;
            }
        }
        return randomSlang;
    }
    
    public ArrayList<ArrayList<HashNode>> getBucketArr(){
        return bucketArray;
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
    
    public Set<String> getDefBySlang (String key){
        Set<String> result = new HashSet<String>();
        int bucketIndex = getBucketIndex(key);
        if(bucketArray.get(bucketIndex)!=null){
            for(HashNode item: bucketArray.get(bucketIndex)){
                result.add(item.value);
            }
            return result;
        }
        else{
            return null;
        }
    }
    
    public Set<String> getSlangByDef(String def){
        Set<String> resultSet = new HashSet<String>();
        for(ArrayList<HashNode> item : bucketArray){
            if(item!=null){
                for(HashNode node : item){
                    if(node.value.contains(def)){
                        resultSet.add(node.key);
                    }
                }
            }
        }
        return resultSet;
    }
    public boolean checkKeyExist(String key){
        int index = getBucketIndex(key);
        if(bucketArray.get(index)!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean add(String key, String value,boolean flag)
    {
        // Find head of chain for given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        
        ArrayList<HashNode> meaningArray = new ArrayList<>();
        HashNode tempNode = new HashNode(key,value,hashCode);

        //add with overwrite
        if(flag == true){
            meaningArray.add(tempNode);
            System.out.println("OK");
            bucketArray.set(bucketIndex, meaningArray);
        }
        //add with duplicate
        else{
            if(bucketArray.get(bucketIndex)!=null){
                meaningArray = bucketArray.get(bucketIndex);
            }
            meaningArray.add(tempNode);
            bucketArray.set(bucketIndex, meaningArray);
        }
        size++;
        
        // If load factor goes beyond threshold, then
        //double hash table size
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
                    this.add(split[0],item,false);
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
        System.out.println(map.getRandomSlang());
    }
}

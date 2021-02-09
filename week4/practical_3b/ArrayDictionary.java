package week4.practical_3b;

import java.util.ArrayList;

public class ArrayDictionary {
    private int size;
    private Integer pointer;
    private Integer index [];
    private String arr [];

    public ArrayDictionary(){
        size = 100;
        index = new Integer[size];
        arr = new String[size];
        pointer = null;
    }

    public String toString() {
        String temp="{";
        boolean t=false;
        for(int i=0; i<size; i++){
            if(index[i]!=null){
                temp+=index[i]+":"+arr[i]+", ";
                t=true;
            }
        }
        if(t){
            return temp.substring(0, temp.length()-2)+"}";
        }
        return "{}";
    }

    public String put(Integer key, String value){
        int c=0;
        for(int i=0; i<size; i++){
            if(key.equals(index[i])){
                String temp = arr[i];
                arr[i]=value;
                return temp;
            }
            if(index[i]==null){
                c++;
            }
        }
        if(c==0){
            stretch();
        }
        for(int i=0; i<size; i++){
            if(index[i]==null){
                pointer=i;
                break;
            }
        }
        index[pointer]=key;
        arr[pointer]=value;
        pointer=null;
        return null;
    }

    public int size(){
        int t=0;
        for(Integer x: index){
            if(x!=null)
                t++;
        }
        return t;
    }

    public boolean contains(Integer key){
        for(int i=0; i<size; i++){
            if(key.equals(index[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        int t=size();
        if(t==0)
            return true;
        return false;
    }

    public String get(Integer key){
        for(int i=0; i<size; i++){
            if(key.equals(index[i])){
                return arr[i];
            }
        }
        return null;
    }

    public String remove(Integer key){
        System.out.println(index[1].equals(key));
        for(int i=0; i<size; i++){
            if(key.equals(index[i])){
                String temp = arr[i];
                index[i] = null;
                arr[i] = null;
                return temp;
            }
        }
        return null;
    }

    public boolean equals(Object other){
        if(other == this)
            return true;
        if(other instanceof ArrayDictionary){
            ArrayDictionary AD = (ArrayDictionary) other;
            if(size()!=AD.size()){
                return false;
            }
            for(Integer x: index){
                if(x!=null){
                    if(!AD.contains(x)){
                        return false;
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public void clear(){
        size = 100;
        index = new Integer[size];
        arr = new String[size];
        pointer = null;
    }

    public void stretch(){
        size += 100;
        Integer[] I = index.clone();
        String[] S = arr.clone();
        index = new Integer[size];
        arr = new String[size];
        for(int i=0; i<size-100; i++){
            index[i] = I[i];
            arr[i] = S[i];
        }
    }

    public ArrayList<Integer> keys(){
        ArrayList<Integer> arraylist = new ArrayList<>(size());
        for(Integer x: index){
            if(x!=null)
                arraylist.add(x);
        }
        return arraylist;
    }

    public ArrayList<String> values(){
        ArrayList<String> arraylist = new ArrayList<>(size());
        for(String x: arr){
            if(x!=null)
                arraylist.add(x);
        }
        return arraylist;
    }

    public static void main(String[] args) {
        ArrayDictionary x = new ArrayDictionary();
        System.out.println(x.isEmpty());
        x.put(69, "yes");x.put(69, "yes");x.put(422, "no");x.put(422, "no");
        System.out.println(x);
        System.out.println(x.size());
        System.out.println(x.contains(69));
        System.out.println(x.isEmpty());
        System.out.println(x.get(69));
        System.out.println(x.remove(422));
        System.out.println(x);

        ArrayDictionary y = new ArrayDictionary();
        y.put(69, "yes");
        System.out.println(y);
        System.out.println(x.equals(y));
        y.clear();
        System.out.println(y);
        for(int i=0; i<=100; i++){
            y.put(i, String.valueOf(Character.toChars(i)));
        }
        System.out.println(y);
        for(Integer xx: y.keys()){
            System.out.print(xx);
        }
    }
}

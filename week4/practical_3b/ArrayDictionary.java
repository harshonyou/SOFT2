package week4.practical_3b;

public class ArrayDictionary {
    private int size;
    private Integer index;
    public String arr [];

    public ArrayDictionary(){
        size = 100;
        arr = new String[size];
        index = null;
    }

    public String toString() {
        String temp="{";
        if(index!=null){
            for(int i=0; i<=index; i++){
                temp+=i+":"+arr[i]+", ";
            }
        }else{
            return "{}";
        }
        return temp.substring(0, temp.length()-2)+"}";
    }

}

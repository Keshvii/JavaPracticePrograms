public class commonPrefixStringArrayElement {
    
    public static String commonPrefix(String[] arr){
        if(arr.length <=0) return "Invalid! No elements present in string array";
        
        String prefix=arr[0];
        
        for(int i=1; i<arr.length; i++){
            
            while(arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length()==0){
                    return "No common prefix!";
                }
            }
        
        }
        
        return prefix;
    }
    
    public static void main(String[] args) {
        String[] arr = {"lem", "lemonade", "length"};
        System.out.println("common prefix is : '"+commonPrefix(arr)+"'");
    }
    
}

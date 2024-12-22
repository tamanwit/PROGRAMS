public class string_sorting {
    public static void main(String[] args) {
        String st1 = "teacher";
        String st2 = "cheater";
        String a="",b="";
        char temp;
        char arr[] = new char[st1.length()];
        char arr1[] = new char[st2.length()];
        for(int i=0; i<st1.length(); i++){
            arr[i] = st1.charAt(i);
            arr1[i] = st2.charAt(i);
        }
        //bubble sorting
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if((int)arr[j]>(int)arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr1.length-1; i++){
            for(int j=0; j<arr1.length-1; j++){
                if((int)arr1[j]>(int)arr1[j+1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        //array to string
        for(int i=0; i<arr.length; i++){
           a = a+arr[i];
           b = b+arr1[i];
        }
        System.out.println(a);
        System.out.println(b);

        if(a.equalsIgnoreCase(b)==true)
            System.out.println("happy holi");
        else{
            System.out.println("Eid mubarak");
        }
    }
}

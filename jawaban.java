class TipeData {
    public static void main(String[] args) {
        // Tipe Data Primitive
        byte byteVar = 127; //8-bit integer
        short shortVar =32000; //16-bit integer
        int intVar = 2147483647; //32-bit innteger
        //long longVar = 92233372036854775807; //64-bit integer
        
        float floatVar = 3.14f; //32-bit floating point
        double doubleVar = 3.14159265359; //64-bit floating point
        
        char charVar = 'A'; //16-bit Unicode character
        boolean boolVar = true; //true or false
        
        //menampilkkan nilai dan tipe data dari masing-masing variable
        System.out.println("Tipe Data Primitive:");
        System.out.println("byteVar: "+ byteVar);
        System.out.println("shortVar: "+ shortVar);
        System.out.println("intVar: "+ intVar);
       // System.out.println("longVar: "+ longVar);
        System.out.println("floatVar: "+ floatVar);
        System.out.println("doubleVar: "+ doubleVar);
        System.out.println("charVar: "+ charVar);
        System.out.println("boolVar: "+ boolVar);
        
        // Tipe Data Reference
        String stringVar = "Hello Java!"; //string adalah tipe data referensi
        System.out.println("\nTipe Data Reference");
        System.out.println("stringVar: "+ stringVar);
        
        
        
    
    }
}
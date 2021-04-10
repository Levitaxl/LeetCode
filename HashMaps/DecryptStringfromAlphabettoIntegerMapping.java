/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class DecryptStringfromAlphabettoIntegerMapping {
    Map<String,String> map;  

    public DecryptStringfromAlphabettoIntegerMapping() {  
        this.map = new HashMap<>();
    }

    void printMap(){
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
    }
    void createMap()   
    {  
       // Scanner entrada = new Scanner(System.in);
        char ch[]="abcdefghijklmnopqrstuvwxyz".toCharArray(); 
        String value;
        for (int i = 0; i < 26; i++){
            value="";
            if(i<9) value=Integer.toString(i+1);
            else    value=(i+1)+"#";
            String value2=""+ch[i];
            map.put(value,value2);
        }
    }  
    private String freqAlphabets(String s) {
        char ch[]=s.toCharArray(); 
        String word="";
        int cont=0;
        String output="";
        while(cont<s.length()){
            word="";
            word+=ch[cont];
            if(cont+2<s.length() && ch[cont+2]=='#'){
                word+=ch[cont+1];
                word+=ch[cont+2];
                cont=cont+3;
            }
            else  cont++;
            
            output+=map.get(word);
            
        }
        
       
        return output;
    }
    
    public static void main(String[] args) {
        DecryptStringfromAlphabettoIntegerMapping obj= new DecryptStringfromAlphabettoIntegerMapping();
        obj.createMap();
        System.out.println(obj.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    } 
    
}

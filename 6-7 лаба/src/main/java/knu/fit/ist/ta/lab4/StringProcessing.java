/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.springframework.util.StringUtils;
/**
 *
 * @author HP-Notebook
 */
public class StringProcessing {
     String text;

    public StringProcessing() {

        text = "The term “Internet of Things” was coined by entrepreneur Kevin Ashton, one of the founders of the Auto-ID Center at MIT. Ashton was part of a team that discovered how to link objects to the internet through an RFID tag. He first used the phrase “Internet of Things” in a 1999 presentation – and it has stuck around ever since.\n" +
"Ashton may have been first to use the term Internet of Things, but the concept of connected devices – particularly connected machines – has been around for a long time. For example, machines have been communicating with each other since the first electric telegraphs were developed in the late 1830s. Other technologies that fed into IoT were radio voice transmissions, wireless (Wi-Fi) technologies and supervisory control and data acquisition (SCADA) software. Then in 1982, a modified Coke machine at Carnegie Mellon University became the first connected smart appliance. Using the university’s local ethernet or ARPANET – a precursor to today’s internet – students could find out which drinks were stocked, and whether they were cold.\n" +
"Today, we’re living in a world where there are more IoT connected devices than humans. These IoT connected devices and machines range from wearables like smartwatches to RFID inventory tracking chips. IoT connected devices communicate via networks or cloud-based platforms connected to the Internet of Things. The real-time insights gleaned from this IoT collected data fuel digital transformation. The Internet of Things promises many positive changes for health and safety, business operations, industrial performance, and global environmental and humanitarian issues.\n" +
"IoT applications are used to address many real-world issues – traffic congestion, city services, economic development, citizen engagement, and public safety and security. Smart cities often embed IoT sensors into the physical infrastructure, such as streetlights, water meters and traffic signals.IoT technology captures data streaming in real time from the Internet of Medical Things (IoMT) – such as wearables and other medical connected devices that monitor exercise, sleep and other health habits. This IoT data enables precise diagnoses and treatment plans, improves patient safety and outcomes, and streamlines care delivery.";

       text = cleanString(text);
    }
    
    public String getText() {
        return this.text;
    }
    
    public String getCleanText()
    {
        return String.join(" ", getList(text));
    }

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    private String cleanString(String input){
    input = input.toLowerCase();
    input = input.replaceAll("-{2,}","");
    input = input.replaceAll(" {2,}"," ");
    input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    }
    
    /**
     *
     * @param s
     * @return
     */
    
     public String getFrequentWord(String s) {
        String[] str = s.split("\\W+");         
        int[] howMuch = new int[str.length];    
        int maxCount = 0;                       
        int index = 0;                          
        for(int i=0; i<str.length; i++) 
            for(int j=0; j<str.length; j++) 
                if(str[i].equals(str[j])) howMuch[i]++; 
        for(int i=0; i<howMuch.length; i++) 
            if(howMuch[i]>maxCount) {
                maxCount = howMuch[i];                  
                index = i;                              
            }
        return str[index];                     
    }
     
    public String get4FirstWords(String text) {
        String str = "";
        String textMod = text;
        for (int i = 0; i<4; i++) {
            str += getFrequentWord(textMod) + " ";
            textMod = textMod.replaceAll(getFrequentWord(textMod), "");    
        }
        return str;
    }
    
       public int getAmountWithoutK(String s) {
        String[] str = s.split("\\W+");
        if (s == "") return 0;
        int cnt = 0;
        int z;
        
        for(int i=0; i<str.length; i++) {
            if (str[i].contains("k")) cnt++;
        }

        z = str.length - cnt;
        
        return z;
    }
      
     public String getAmountWords3Letters(String s){
    
        String[] str = s.split("\\W+");
        List<String> result = getList(s);
        int answerLine = 0;
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            Set<String> resLetters = new HashSet<>();
            
            for (int i = 0; i < letters.length(); i++){
                
                resLetters.add("" + letters.charAt(i));
            }
            if (resLetters.size() == 4)
                answerLine++;
        }
        return "" + answerLine;
    }
     
     public String getFiveMostPopularWords3Letters(String s)
    {   
        String[] str = s.split("\\W+");
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentWordLength;
        String sequence;
        for (int i = 0; i < str.length; i++) {
            currentWordLength = str[i].length();
            for (int j = 0; j < currentWordLength - 3; j++) {
                sequence = str[i].substring(j, j + 3);
                if(dictionary.containsKey(sequence))
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                else
                   dictionary.put(sequence, 1);
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        Object[] sortedArray = list.toArray();
        return Arrays.toString(Arrays.copyOfRange(sortedArray, 0, 5));
    }
}

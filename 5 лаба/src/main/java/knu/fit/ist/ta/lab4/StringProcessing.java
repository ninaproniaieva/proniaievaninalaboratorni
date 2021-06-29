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


/**
 *
 * @author Владимир
 */
public class StringProcessing {
     String text;

    public StringProcessing() {

        text = "You wouldn’t know it by all the hype that surrounds the Internet of Things, but I’ll let you in on a little secret. IoT is dead.\n" +
"It might sound crazy coming from a person who makes a living in and around the world of IoT, but it’s true— IoT is dead because it never really existed in the first place.\n" +
"According to Wikipedia, IoT is defined as:\n" +
"…the network of physical devices, vehicles, home appliances, and other items embedded with electronics, software, sensors, actuators, and connectivity which enables these things to connect, collect and exchange data.\n" +
"When you boil that statement down to its constituent elements you might as well say: it’s a network of devices with electronics (aka computers) that are connected together to exchange data.\n" +
"According to Wikipedia, the Internet is defined as:\n" +
"The Internet is the global system of interconnected computer networks that use the Internet protocol suite (TCP/IP) to link devices worldwide.\n" +
"If you boil that statement down, it might as well say: it’s a network of devices with electronics (aka computers) that are connected together to exchange data.\n" +
"At the end of the day they are the same thing— using the Internet to connect computers of varying sizes and shapes together.\n" +
"But IoT has other challenges. Right?\n" +
"You’ll hear a lot of buzzwords and “new” technologies being thrown around in the IoT world, so surely IoT devices have different needs? Not really. Computers and devices both need connectivity. Computers and devices both need security. Computers and devices both need some edge and some cloud computing power. Computers and devices both need some form of management. The only real difference is one of scale— by 2025 there may be as many as 21.5 billion “IoT” devices connected to the Internet.\n" +
"When it comes down to it, “IoT” is really just a term of scale— the “thing” part denotes that just about any thing can and will be connected to the Internet (even though in many cases it probably shouldn’t).\n" +
"There’s little doubt as to the massive scale of devices that will be connected to the Internet in coming years, but there is another (arguably more important) dimension of scale that is often overlooked…\n" +
"The Scale of Diversity\n" +
"Unlike the early days of the PC and mobile, there is no one clear monopoly over modern connected devices. Just take a look on Amazon.com and it’s hard to miss the thousands of different options for connected lightbulbs, garage door openers, sprinkler systems, security systems, water heaters, AC units, and on, and on— and this is just in the connected home category (which may end up being the smallest market). There are thousands of other businesses out there providing connectivity and sensors for heavy machinery, transportation, infrastructure, energy, industrial processes, medical, etc.";

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
     
    public String get8FirstWords(String text) {
        String str = "";
        String textMod = text;
        for (int i = 0; i<8; i++) {
            str += getFrequentWord(textMod) + " ";
            textMod = textMod.replaceAll(getFrequentWord(textMod), "");    
        }
        return str;
    }
    
       public int getAmountWithoutS(String s) {
        String[] str = s.split("\\W+");
        if (s == "") return 0;
        int cnt = 0;
        int z;
        
        for(int i=0; i<str.length; i++) {
            if (str[i].contains("s")) cnt++;
        }

        z = str.length - cnt;
        
        return z;
    }
      
     public String getAmountWords4Letters(String s){
    
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

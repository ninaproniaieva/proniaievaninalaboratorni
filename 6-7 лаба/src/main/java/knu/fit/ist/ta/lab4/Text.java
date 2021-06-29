/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author HP-Notebook
 */
public class Text {
    public static String text;
    static Matcher matcher;
    static Pattern pattern;
    
    public Text(){
          text = "The term “Internet of Things” was coined by entrepreneur Kevin Ashton, one of the founders of the Auto-ID Center at MIT. Ashton was part of a team that discovered how to link objects to the internet through an RFID tag. He first used the phrase “Internet of Things” in a 1999 presentation – and it has stuck around ever since.\n" +
"Ashton may have been first to use the term Internet of Things, but the concept of connected devices – particularly connected machines – has been around for a long time. For example, machines have been communicating with each other since the first electric telegraphs were developed in the late 1830s. Other technologies that fed into IoT were radio voice transmissions, wireless (Wi-Fi) technologies and supervisory control and data acquisition (SCADA) software. Then in 1982, a modified Coke machine at Carnegie Mellon University became the first connected smart appliance. Using the university’s local ethernet or ARPANET – a precursor to today’s internet – students could find out which drinks were stocked, and whether they were cold.\n" +
"Today, we’re living in a world where there are more IoT connected devices than humans. These IoT connected devices and machines range from wearables like smartwatches to RFID inventory tracking chips. IoT connected devices communicate via networks or cloud-based platforms connected to the Internet of Things. The real-time insights gleaned from this IoT collected data fuel digital transformation. The Internet of Things promises many positive changes for health and safety, business operations, industrial performance, and global environmental and humanitarian issues.\n" +
"IoT applications are used to address many real-world issues – traffic congestion, city services, economic development, citizen engagement, and public safety and security. Smart cities often embed IoT sensors into the physical infrastructure, such as streetlights, water meters and traffic signals.IoT technology captures data streaming in real time from the Internet of Medical Things (IoMT) – such as wearables and other medical connected devices that monitor exercise, sleep and other health habits. This IoT data enables precise diagnoses and treatment plans, improves patient safety and outcomes, and streamlines care delivery.";
}
    
    public static String cleanText(String ctext){
        
        ctext = ctext.toLowerCase();
        ctext = ctext.replaceAll("\\bthe|and\\b", "").trim();
        ctext = ctext.replaceAll("\\b\\w{1,2}\\b", "").trim();
        ctext = ctext.replaceAll("[^\\w -]", "").trim();
        ctext = ctext.replaceAll("-{2,}","");
        ctext = ctext.replaceAll(" {2,}"," ");
        return ctext;
    }
    
    public static List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }
    
    public static int sizeOfList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result.size();
    }
    
    public static Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }
    
    public static int sizeOfSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result.size();
    }
    
    public static ArrayList<String> first7Often(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        ArrayList<String> result = new ArrayList<String>();
        
        int size = words.size();
        int m = 7; // m - the number of words to perform calculations for
        int[] z = new int[size]; 
        // z[i] - frequency of occurrence of the word with serial number i
        int[] n = new int[m];
        int[] t = new int[m];
        for(int j=0;j<size;++j){
            z[j]=0;
            for(int i=0; i<size ;++i){
                    
                if(words.get(j).equals(words.get(i))){
                    z[j]=z[j]+1;
                }
                
            }
            for(int q=0;q<j;++q){   //avoid the same words
                if(words.get(j).equals(words.get(q))) z[j]=0;
            }
        }
            
        for(int j=0; j<m;++j){
            for(int i=0;i<size;++i){
                   
                if(z[i]>t[j]){
                    t[j]=z[i];  //the highest frequency of occurence 
                    n[j]=i;     //the serial number of the word
                }   
                    
            }
            z[n[j]]=0;  //not to repeat words
        }
        for(int y=0;y<m;++y){
            result.add(words.get(n[y])+" - "+t[y]);
        }
        
        return result;
    }
    
    public static int notU(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static int words4Letters(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static ArrayList<String> seq3Let(String text){
        int p = 0;
        String stext = text;
        String fseq;       
        
        int t=0, m=6, d=0; // m - the number of sequences to perform calculations with
        // d - so as not to repeat the sequence, t - frequency of occurrence
        String seq="";     
        ArrayList<String> all = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        
        for(int q=0;q<m;++q){
            t=0;
            for(int i=3, j=0;i<text.length();++i){
                p=0;
                d=0;
                if(stext.charAt(i-1)==' '){
                    i += 3;
                    j += 3;
                }
                fseq = stext.substring(j, i);
                for(int z=0;z<q;++z){
                    if(fseq.equals(all.get(z))){d = 1;}
                }
                pattern = Pattern.compile(fseq);
                matcher = pattern.matcher(text);
                while(matcher.find() && d!=1){
                    ++p;
                }
                if(p>t){t=p;seq=fseq;}
                ++j;
            }
            all.add(seq);
            result.add(seq+" - "+t);
            }
        return result;
    }
}

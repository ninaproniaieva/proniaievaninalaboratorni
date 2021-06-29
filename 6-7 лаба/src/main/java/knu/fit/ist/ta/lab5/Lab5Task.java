/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.Random;
import knu.fit.ist.ta.lab4.Text;
import org.springframework.stereotype.Service;
/**
 *
 * @author HP-Notebook
 */
@Service
public class Lab5Task {
    Random rnd = new Random();
    
    public String list(String nStr){
        if(nStr.equals("")) return "Enter the number of objects";
        int n = Integer.parseInt(nStr);
        if(n<=0) return "Enter the positive integer value";
        int seed = rnd.nextInt();

        ListOfObj.setSeed(seed);

        SortObj.setList(ListOfObj.listOfObj(n));
        
        return SortObj.listObj().toString();
    }
    
    public String mts(String nStr, String pStr){
        if(nStr.equals("") || pStr.equals("")) return "Enter the number of "
                + "threads and the search integer value >0";
        int n = Integer.parseInt(nStr);
        int p = Integer.parseInt(pStr);
        return MultiThreadStart.show(n,p,ListInt.listOfInt(MultiThreadStart.getMaxSize()));
        
    }
    
    public String sortStr(){
        return SortObj.sortApproach1().toString();
    }
    
    public String sortShr(){
        return SortObj.sortApproach2().toString();
    }
    
    public String sortedList(){
        return SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()).toString();
    }
    
    public String searchWord(String word, String startStr, String finishStr){
        
        if(word.equals("")){
            return "Please, enter the word to look for";
        }

        if(startStr.equals("") && finishStr.equals("")){    
            if(SearchWord.linearSearch(word,Text.cleanText(Text.text)).isEmpty()){   
                return "This text does not contain the search word";    
            }
            else{ 
                return "The index(indices) of the search word: "+ SearchWord.linearSearch(word,Text.cleanText(Text.text)).toString();
            }
        }
        
        if(!finishStr.equals("") && startStr.equals("")){
            int finish = Integer.parseInt(finishStr);
            
            if(finish<=0){
                return "The finish index must be >0";
            }
            if(finish>Text.getList(Text.cleanText(Text.text)).size()){
                return "The finish index must be less than or equal to a size of the text";
            }
            if(SearchWord.linearSearch(word,Text.cleanText(Text.text),finish).isEmpty()){   
                return "This part of the text does not contain the search word";    
            }
            return "The index(indices) of the search word is(are): "+
            SearchWord.linearSearch(word,Text.cleanText(Text.text),finish).toString();
            
            
        }
        
        int start = Integer.parseInt(startStr);
        
        if(!startStr.equals("") && finishStr.equals("")){
            
            if(start<0){
                return "The start index must be >=0";
            }
            if(start>=Text.getList(Text.cleanText(Text.text)).size()){
                return "The start index must be less than a size of the text";
            }
            if(SearchWord.linearSearch(word,start,Text.cleanText(Text.text)).isEmpty()){   
                return "This part of the text does not contain the search word";    
            }
            return "The index(indices) of the search word is(are): "+
            SearchWord.linearSearch(word,start,Text.cleanText(Text.text)).toString();
            
        }
        
        int finish = Integer.parseInt(finishStr);
        
        if(start<0 || finish<=0){return "The start index must be >=0 and the finish index must be >0";}
        
        if(finish>Text.getList(Text.cleanText(Text.text)).size() || start>=Text.getList(Text.cleanText(Text.text)).size()){
                return "The finish index must be less than or equal to a size of the text"
                        + " and he start index must be less than a size of the text";
            }
        
        if(start>finish){
            
            return "The start index must be less than the finish index";
            
        } 
        
        else{
            if(SearchWord.linearSearch(word,start,finish,Text.cleanText(Text.text)).isEmpty()){   
                return "This part of the text does not contain the search word";    
            }
            return "The index(indices) of the search word is(are): "+
            SearchWord.linearSearch(word,start,finish,Text.cleanText(Text.text)).toString();
        }
        
    }
}

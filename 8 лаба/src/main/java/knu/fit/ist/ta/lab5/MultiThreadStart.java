/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP-Notebook
 */
public class MultiThreadStart {
     private static long time;
    public static void main(String[] args) {
        int maxSize = 1000000;
        List<Integer> list = ListInt.listOfInt(maxSize);
        List<MultiThreadSearch> mtsList= new ArrayList<>(); 
        int maxItems = list.size();
        int find = list.get(list.size() - 1);
        
        int n = 35, s=0, t=maxItems / n, k=0;
        k=t;
        
        for(int i=0;i<n;++i){
            MultiThreadSearch mts = new MultiThreadSearch(find, list.subList(s, t));
            mtsList.add(mts);
            s=t;
            if(i==n-2) t=maxItems;
            else t+=k;
        }

        time = System.currentTimeMillis();

        for(int i=0;i<n;++i){
            new Thread(mtsList.get(i)).start();
        }
        
        mtsList.forEach(mts -> {
            if(!mts.isFinished()){
                while(!mts.isFinished()){};
            };
        });
        
        for(int i=0;i<n;++i){
            System.out.println(mtsList.get(i).getSearchResults());
        }
        
        time = System.currentTimeMillis() - time;
        System.out.println("time (ms):" + time);
        
        System.out.println("Size of list - "+list.size());
        
    }
    
    private static int maxSize = 1000000;

    public static int getMaxSize() {
        return maxSize;
    }
    
    public static String show(int n, int p, List<Integer> list){
        if(n<=0 || p<0) return "The number of threads and the search value must be >0";
        List<MultiThreadSearch> mtsList= new ArrayList<>();
        List<String> result = new ArrayList<>();
        int maxItems = list.size();
        if(maxItems<=0) return "The list is empty";
        if(maxItems<n) return "The number of the threads is too large, enter new value";
        int find = p;
        
        int  s=0, t=maxItems / n, k=0;
        k=t;
        
        for(int i=0;i<n;++i){
            MultiThreadSearch mts = new MultiThreadSearch(find, list.subList(s, t));
            mtsList.add(mts);
            s=t;
            if(i==n-2) t=maxItems;
            else t+=k;
        }

        time = System.currentTimeMillis();

        for(int i=0;i<n;++i){
            new Thread(mtsList.get(i)).start();
        }
        
        int a=0;
        
        mtsList.forEach(mts -> {
            if(!mts.isFinished()){
                while(!mts.isFinished()){};
            };
        });
        
        for(int i=0;i<n;++i){
            if(!mtsList.get(i).getSearchResults().contains(-1)){ 
                int ind = mtsList.get(i).getSearchResults().get(0);
                if(i!=0) ind += k*i+1;
                result.add("Thread"+(i+1)+" - "+mtsList.get(i).getSearchResults()+" - "+ind);
            }
        }
        
        time = System.currentTimeMillis() - time;
        if(result.isEmpty()) return "The size of list - "+list.size()+", the list doesn`t contain "+p;
        return "The size of list - "+list.size()+", the thread + [the index of the element in the thread] +"
                + " the index of the element in the list: "+result.toString()+
                ", time (ms): "+time; 
        
    }
    
    public static String showTest(int n, int p, List<Integer> list){
        if(n<=0 || p<0) return "The number of threads and the search value must be >0";
        List<MultiThreadSearch> mtsList= new ArrayList<>();
        List<String> result = new ArrayList<>();
        int maxItems = list.size();
        if(maxItems<=0) return "The list is empty";
        if(maxItems<n) return "The number of the threads is too large, enter new value";
        int find = p;
        
        int  s=0, t=maxItems / n, k=0;
        k=t;
        
        for(int i=0;i<n;++i){
            MultiThreadSearch mts = new MultiThreadSearch(find, list.subList(s, t));
            mtsList.add(mts);
            s=t;
            if(i==n-2) t=maxItems;
            else t+=k;
        }

        for(int i=0;i<n;++i){
            new Thread(mtsList.get(i)).start();
        }
        
        mtsList.forEach(mts -> {
            if(!mts.isFinished()){
                while(!mts.isFinished()){};
            };
        });
        
    
        
        for(int i=0;i<n;++i){
            if(!mtsList.get(i).getSearchResults().contains(-1)){ 
                int ind = mtsList.get(i).getSearchResults().get(0);
                if(i!=0) ind += k*i+1;
                result.add("Thread"+(i+1)+" - "+mtsList.get(i).getSearchResults()+" - "+ind);
            }
        }
        
        
        if(result.isEmpty()) return "The size of list - "+list.size()+", the list doesn`t contain "+p;
        return "The size of list - "+list.size()+", the thread + [the index of the element in the thread] +"
                + " the index of the element in the list: "+result.toString();
        
    }
}

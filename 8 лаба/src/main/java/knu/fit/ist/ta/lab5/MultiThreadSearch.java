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
public class MultiThreadSearch implements Runnable {

    private List<Integer> searchResults = new ArrayList<>();

    private List<Integer> inputList;

    int find;

    private final LinearSearch searching = new LinearSearch();

    private boolean finished = false;
    
    @Override
    public void run() {
        searchResults.add(searching.linearSearch(find, inputList));
        finished = true;
    }
    
    public int getFind() {
        return find;
    }

    public void setFind(int find) {
        this.find = find;
    }

    public MultiThreadSearch() {
    }

    public MultiThreadSearch(int find, List<Integer> inputList) {
        this.find = find;
        this.inputList = inputList;
    }

    public List<Integer> getSearchResults() {
        return searchResults;
    }

    public List<Integer> getInputList() {
        return inputList;
    }

    public boolean isFinished() {
        return finished;
    }
}

package com.bridgelabz;

import java.util.List;
import java.util.TreeMap;

public class CollectionClass {

    public TreeMap<String, UpdateContact> personDetails = new TreeMap<>();
    public TreeMap<String, List<UpdateContact>> cityPersonMap = new TreeMap<>();
    public TreeMap<String, List<UpdateContact>> statePeronMap = new TreeMap<>();
    public TreeMap<String,UpdateContact> sortedAddressBook = new TreeMap<>();
}

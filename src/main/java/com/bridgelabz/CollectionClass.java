package com.bridgelabz;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class CollectionClass {

    public HashMap<String, UpdateContact> personDetails = new HashMap<>();
    public TreeMap<String, List<UpdateContact>> cityPersonMap = new TreeMap<>();
    public TreeMap<String, List<UpdateContact>> statePeronMap = new TreeMap<>();
}

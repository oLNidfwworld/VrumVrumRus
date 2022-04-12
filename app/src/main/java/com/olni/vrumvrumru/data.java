package com.olni.vrumvrumru;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.jar.Attributes;


public class data {
    public static List<DataModel> dataModelList = new ArrayList<DataModel>();
    public static void Add(DataModel model){

        dataModelList.add(model);
    }

}

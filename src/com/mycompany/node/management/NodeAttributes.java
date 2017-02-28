package com.mycompany.node.management;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public enum NodeAttributes
{
    // add one more line in RESTApi for the OSS repo testing
    // add one line to advance the node management branch
    // add one line in here
    NODE_ATTRIBUTES_UNKNOWN(0,"UNKNOWN"),
    NODE_ATTRIBUTES_TYPE(1,"Type"),
    NODE_ATTRIBUTES_SHELF(2,"Shelf"),
    NODE_ATTRIBUTES_CARD(3,"Card"),
    NODE_ATTRIBUTES_PORT(4,"Port");

    private int index;
    private String name;

    // add one line here in NodeAttributes for the NodeManagement repo testing
    NodeAttributes(int index, String name)
    {
        this.index = index;
        this.name = name;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }
}

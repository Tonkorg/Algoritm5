package com.example.fx111111111;

public class LifoRealise implements FifoLiFo{



    NodeLifo first = null;
    NodeLifo last = null;
    int size = 0;


    @Override
    public void add(int value, char simbol) {
        if (size == 0)
        {
            first = new NodeLifo(null,value, simbol);
            last = first;

        }
        else
        {
            NodeLifo newNode = new NodeLifo(last,value, simbol);
            last = newNode;
        }
        size++;

    }

    @Override
    public void delete() {

        last.prev = last;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void show() {
        for (int i =0; i < size; i++)
        {
            System.out.println(" Число - " +last.value + " символ - " + last.simbol);
            last =last.prev;
        }

    }
    class NodeLifo
    {
        NodeLifo prev;
        int value;
        char simbol;

        public NodeLifo(NodeLifo prev, int value, char simbol) {
            this.prev = prev;
            this.value = value;
            this.simbol = simbol;
        }
    }



}

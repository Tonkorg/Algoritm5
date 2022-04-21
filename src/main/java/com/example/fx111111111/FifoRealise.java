package com.example.fx111111111;

public class FifoRealise implements FifoLiFo {
    NodeFifo first = null;
    NodeFifo last = null;
    int size = 0;

    @Override
    public void add(int value, char simbol) {
        if (size == 0) {
            first = new NodeFifo(null, value, simbol);
            last = first;
        } else {
            NodeFifo newNode = new NodeFifo(null, value, simbol);
            last.next = newNode;
            last = newNode;

        }
        size++;
    }


    @Override
    public void delete() {
        first = first.next;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void show() {

        for ( int i = 0; i< size; i++)
        {
            System.out.println(" Число - " +first.value + " символ - " + first.simbol);
            first = first.next;
        }
    }
    class NodeFifo
    {
        NodeFifo next;
        int value;
        char simbol;

        public NodeFifo(NodeFifo next, int value, char simbol) {
            this.next = next;
            this.value = value;
            this.simbol = simbol;
        }
    }
}

package com.company;

/**
 * Created by eyankiv on 10-Sep-16.
 */
public class SearchThread extends Thread{
    private int to,from;
    private String item;
    private String [] list;
    private ItemFoundListener listener;
    private int id;

    public SearchThread(int from, int to, String[] list,String item,ItemFoundListener listener, int id) {
        this.to = to;
        this.from = from;
        this.list = list;
        this.id = id;
        this.listener = listener;
        this.item = item;
    }

    @Override
    public void run() {
        if(listener == null)
            return;
        for (int i = from; i < to; i++) {
            if(!listener.proceed())
                return;
            if(item.equals(list[i])){
                listener.itemFound(id,i);
                return;
            }

        }
        listener.itemFound(id, -1);
    }

    static interface ItemFoundListener{
        void itemFound(int id, int position);
        boolean proceed();
    }
}


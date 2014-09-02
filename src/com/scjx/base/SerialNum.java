package com.scjx.base;

public class SerialNum {

	private static int nextSerialNum = 1;

    @SuppressWarnings("unchecked")
    private static ThreadLocal serialNum = new ThreadLocal() {
        protected synchronized Object initialValue() {
            return new Integer(nextSerialNum++);      
        }                                                           
    };

    public static int get() {
        return ((Integer) (serialNum.get())).intValue();
    }
    
    @SuppressWarnings("unchecked")
    public static void set(Integer newSerial){
        serialNum.set(newSerial);
    }
}

package com.scjx.base;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class TestHashMapObject {
	
	@Test
	public  void testHashMap() {
		HashMap<MapObjectForm,String>  hm = new HashMap<MapObjectForm,String>();
		hm.put(new MapObjectForm("1","11"), "test 1");  
        hm.put(new MapObjectForm("2","22"), "test 2");  
        hm.put(new MapObjectForm("3","33"), "test 3");  
	          
        MapObjectForm key1=new MapObjectForm("1","11");  
        System.out.println(hm.get(key1));
        assertEquals("test 1",hm.get(key1));   

	}

}

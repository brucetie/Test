package com.scjx.base;



public class MapObjectForm  {
	
	 	private String mapKey;
	 	private String mapValue;
		public MapObjectForm(String mapKey, String mapValue) {
			this.mapKey = mapKey;
			this.mapValue = mapValue;
		}
		@Override
		public boolean equals(Object obj) {
			MapObjectForm obf = (MapObjectForm)obj;
			return this.mapKey.equals(obf.mapKey)&&this.mapValue.equals(obf.mapValue);
		}
		@Override
		public int hashCode() {
			 int result = 1;  
			 
	        result = result * 31 + mapKey.hashCode();  
	        result = result * 31 + mapValue.hashCode();  
	        return result; 
		}
		
		
	 	
	 	

}

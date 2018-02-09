package com.jme3.shader.uniformValue;

import java.nio.FloatBuffer;



public class Default implements UniformValue{

	@Override
	public Object getValue(Object oldValue, Object newValue, FloatBuffer multiData) {
		 if (newValue.equals(oldValue)) {
             return oldValue;
         }
         return newValue;
         		
	}

}

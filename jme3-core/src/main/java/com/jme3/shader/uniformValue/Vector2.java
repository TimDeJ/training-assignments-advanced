package com.jme3.shader.uniformValue;

import java.nio.FloatBuffer;


import com.jme3.math.Vector2f;


public class Vector2 implements UniformValue{

	@Override
	public Object getValue(Object oldValue, Object newValue, FloatBuffer multiData) {
		 if (newValue.equals(oldValue)) {
             return oldValue;
         }
		 if (oldValue == null) {
            return new Vector2f((Vector2f) newValue);
         } else {
             return ((Vector2f) oldValue).set((Vector2f) newValue);
         }
		
	}

}

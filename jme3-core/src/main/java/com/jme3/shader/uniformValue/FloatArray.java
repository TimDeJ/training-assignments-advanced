package com.jme3.shader.uniformValue;

import java.nio.FloatBuffer;

import com.jme3.math.Matrix3f;
import com.jme3.util.BufferUtils;

public class FloatArray implements UniformValue{

	@Override
	public Object getValue(Object oldValue, Object newValue, FloatBuffer multiData) {
		 if (newValue.equals(oldValue)) {
             return oldValue;
         }
         Matrix3f m3 = (Matrix3f) newValue;
         if (multiData == null) {
             multiData = BufferUtils.createFloatBuffer(9);
         }
         m3.fillFloatBuffer(multiData, true);
         multiData.clear();
         if (oldValue == null) {
             return new Matrix3f(m3);
         } else {
        	 return ((Matrix3f)oldValue).set(m3);
         }
		
	}

}

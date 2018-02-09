package com.jme3.shader.uniformValue;

import java.nio.FloatBuffer;

public interface  UniformValue {
	public Object getValue(Object oldValue, Object newValue, FloatBuffer multiData);

}

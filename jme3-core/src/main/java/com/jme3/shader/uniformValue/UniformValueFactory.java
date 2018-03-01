package com.jme3.shader.uniformValue;

import java.nio.FloatBuffer;
import java.util.HashMap;

import java.util.Map;
import com.jme3.shader.VarType;;

public class UniformValueFactory {

	// tag::getValue
	private static final Map<VarType, UniformValue> VALUES = new HashMap<VarType, UniformValue>();

	static {
		VALUES.put(VarType.Matrix3, new Matrix3());
		VALUES.put(VarType.Matrix4, new Matrix4());
		VALUES.put(VarType.IntArray, new IntArray());
		VALUES.put(VarType.FloatArray, new FloatArray());
		VALUES.put(VarType.Vector2Array, new Vector2Array());
		VALUES.put(VarType.Vector3Array, new Vector3Array());
		VALUES.put(VarType.Vector4Array, new Vector4Array());
		VALUES.put(VarType.Matrix3Array, new Matrix3Array());
		VALUES.put(VarType.Matrix4Array, new Matrix4Array());
		VALUES.put(VarType.Vector2, new Vector2());
		VALUES.put(VarType.Vector3, new Vector3());
		VALUES.put(VarType.Vector4, new Vector4());
		VALUES.put(VarType.Int, new Default());
		VALUES.put(VarType.Float, new Default());
		VALUES.put(VarType.Boolean, new Default());
	}

	public static Object getValue(VarType type, Object oldValue, Object newValue, FloatBuffer multiData) {
		UniformValue value = VALUES.get(type);
		value = value != null ? value : new Default();
		return value.getValue(oldValue, newValue, multiData);
	}

}

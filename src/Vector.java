package sharkodlak.geometry;

import java.lang.Math;

public class Vector {
	private double angle;
	private double magnitude;

	public Vector(double angle, double magnitude) {
		this.angle = angle;
		this.magnitude = magnitude;
	}

	public double getAngle() {
		return angle;
	}

	public double getMagnitude() {
		return magnitude;
	}

	public double getTerminalPointX(double x) {
		return getTerminalPointX(angle, magnitude, x);
	}

	public static double getTerminalPointX(double angle, double magnitude, double x) {
		return magnitude * Math.cos(angle) + x;
	}

	public double getTerminalPointY(double x) {
		return getTerminalPointY(angle, magnitude, x);
	}

	public static double getTerminalPointY(double angle, double magnitude, double x) {
		return magnitude * Math.sin(angle) + x;
	}

	public String toString() {
		return "↗⟨⦬" + Math.toDegrees(angle) + "°;" + magnitude + "⟩";
	}

	public static class Clockwise extends Vector {
		public Clockwise(double angle, double magnitude) {
			super(angle, magnitude);
		}

		public static double getTerminalPointX(double angle, double magnitude, double x) {
			return Vector.getTerminalPointY(angle, magnitude, x);
		}

		public static double getTerminalPointY(double angle, double magnitude, double x) {
			return Vector.getTerminalPointX(angle, magnitude, x);
		}
	}
}

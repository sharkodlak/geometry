package sharkodlak.geometry;

import java.lang.*;

public class Position {
	private final double x, y;

	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Position add(double vectorX, double vectorY) {
		return new Position(x + vectorX, y + vectorY);
	}

	public boolean equals(Position destination) {
		return equals(destination.x, destination.y);
	}

	public boolean equals(double destinationX, double destinationY) {
		return equals(x, y, destinationX, destinationY);
	}

	public static boolean equals(double sourceX, double sourceY, double destinationX, double destinationY) {
		return sourceX == destinationX && sourceY == destinationY;
	}

	public double getAngle(Position destination) {
		return getAngle(destination.x, destination.y);
	}

	public double getAngle(double destinationX, double destinationY) {
		return getAngle(x, y, destinationX, destinationY);
	}

	public static double getAngle(double sourceX, double sourceY, double destinationX, double destinationY) {
		return Math.atan2(destinationX - sourceX, destinationY - sourceY);
	}

	public double getDistance(Position destination) {
		return getDistance(destination.x, destination.y);
	}

	public double getDistance(double destinationX, double destinationY) {
		return getDistance(x, y, destinationX, destinationY);
	}

	public static double getDistance(double sourceX, double sourceY, double destinationX, double destinationY) {
		return Math.hypot(destinationX - sourceX, destinationY - sourceY);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int hashCode() {
		long bits = Double.doubleToLongBits(x);
		bits ^= Double.doubleToLongBits(y) * 31;
		return (int) bits ^ (int) bits >> 32;
	}

	public boolean isInDistance(Position destination, double maxDistance) {
		return isInDistance(destination.x, destination.y, maxDistance);
	}

	public boolean isInDistance(double destinationX, double destinationY, double maxDistance) {
		return isInDistance(x, y, destinationX, destinationY, maxDistance);
	}

	public static boolean isInDistance(double sourceX, double sourceY, double destinationX, double destinationY, double maxDistance) {
		return getDistance(sourceX, sourceY, destinationX, destinationY) <= maxDistance;
	}

	public String toString() {
		return "#(" + x + ";" + y + ")";
	}
}

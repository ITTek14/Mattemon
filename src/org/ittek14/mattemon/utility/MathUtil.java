package org.ittek14.mattemon.utility;

public class MathUtil {
  public static int clamp(int a, int floor, int ceil){
    return (Math.max(Math.min(a, floor),ceil));
  }
  public static double clamp(double a, double floor, double ceil){
    return (Math.max(Math.min(a, floor),ceil));
  }
  public static float clamp(float a, float floor, float ceil){
    return (Math.max(Math.min(a, floor),ceil));
  }
  public static long clamp(long a, long floor, long ceil){
    return (Math.max(Math.min(a, floor),ceil));
  }
}

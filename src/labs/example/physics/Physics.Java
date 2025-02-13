/*
@author: Connor Davis
@date: 02/10/2025
@purpose: Physics problems for implementation

*/

package labs.example.physics;
import java.lang.Math;

final static double GRAVITY = 9.81

public class Physics {

    public double getDistance(double v, double t){
        double x = v * t
        return x;
    }

    public double getVelocity(double x, double t){
        double v = x / t
        return v;
    }

    public double getMomentum(double m, double v){
        double p = m * v
        return p;
    }

    public double getForce(double m, double a){
        double f = m * a
        return f;
    }

    public double getWork(double f, double d){
        double w = f * d
    }

    public double getKineticEnergy(double m, double v){
        double ke = ((1/2)*m)*(v*v)
        return ke;
    }

    public double getPotentialEnergy(double m, double g, double h){
        double pe = m * g * h
        return pe;
    }
}
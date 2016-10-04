package com.feonr.lesson4;


import static net.feonr.util.Print.*;

    class Cleanser {
        private String s = "Cleanser";
        public void append(String a) { s += a; }
        public void dilute() { append(" dilute()"); }
        public void apply() { append(" apply()"); }
        public void scrub() { append(" scrub()"); }
        public String toString() { return s; }
        public static void main(String[] args) {
            Cleanser x = new Cleanser();
            x.dilute(); x.apply(); x.scrub();
            print(x);
        }
    }
    public class Detergent  {
        // Change a method:
        Cleanser cleanser=new Cleanser();

        public void append(String a) {
            cleanser.append(a);
        }

        public void apply() {
            cleanser.apply();
        }

        public void dilute() {
            cleanser.dilute();
        }

        public void scrub() {
            append(" Detergent.scrub()");

        }

        @Override
        public String toString() {
            return cleanser.toString();
        }

        // Add methods to the interface:
        public void foam() { append(" foam()"); }
        // Test the new class:
        public static void main(String[] args) {
            Detergent x = new Detergent();
            x.dilute();
            x.apply();
            x.scrub();
            x.foam();
            print(x);
            print("Testing base class:");
            Cleanser.main(args);
        }
    }


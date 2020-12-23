package com.company;

public class Runner extends Thread {
    private Runner doRunner;
    private Runner posleRunner;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner doRunner, Runner posleRunner) {
        this.doRunner = doRunner;
        this.posleRunner = posleRunner;


    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " взял палку");
            if (getName().equals("Runner5")) {
                System.out.println(getName() + " бежит к финишу");
                System.out.println(getName() + "бежит к " + doRunner.getName());
            } else {
                System.out.println(getName() + "бежит к " + posleRunner.getName());
                posleRunner.start();
                posleRunner.join();// join() -  упорядачивает потоки
            }

            if (!getName().equals("Runner5")) {
                System.out.println(getName() + " взял палку");
                if (!getName().equals("Runner1")) {
                    System.out.println(getName() + "бежит к " + doRunner.getName());
                }

            }


        } catch (Exception e) {
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.generalizacion1;

/**
 *
 * @author duvan
 */
public abstract class Avestruz extends Ave {

    @Override
    public void desplazarse() {
        System.out.println("me desplazo caminando y corriendo");
    }

    @Override
    public void comer() {
        System.out.println("como plantas");
    }

}

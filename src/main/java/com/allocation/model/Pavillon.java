package com.allocation.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pavillon implements List<Pavillon> {
    private int id ;
    int numbPavillon;
    int nombreEtage;
    public Pavillon(int id, int numbPavillon, int nombreEtage) {
        this.id = id;
        this.numbPavillon = numbPavillon;
        this.nombreEtage = nombreEtage;
    }
    public Pavillon() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumbPavillon() {
        return numbPavillon;
    }
    public void setNumbPavillon(int numbPavillon) {
        this.numbPavillon = numbPavillon;
    }
    public int getNombreEtage() {
        return nombreEtage;
    }
    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
    @Override
    public String toString() {
        return "Pavillon [nombreEtage=" + nombreEtage + ", numbPavillon=" + numbPavillon + "]";
    }
    public boolean equals(Pavillon pavillon2) {
        return ((Pavillon)this).getId() == pavillon2.id ;
    }
    @Override
    public boolean add(Pavillon arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void add(int arg0, Pavillon arg1) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean addAll(Collection<? extends Pavillon> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean addAll(int arg0, Collection<? extends Pavillon> arg1) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean contains(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Pavillon get(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int indexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Iterator<Pavillon> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int lastIndexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public ListIterator<Pavillon> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ListIterator<Pavillon> listIterator(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean remove(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Pavillon remove(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean removeAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Pavillon set(int arg0, Pavillon arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public List<Pavillon> subList(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public <T> T[] toArray(T[] arg0) {
        // TODO Auto-generated method stub
        return null;
    }
}

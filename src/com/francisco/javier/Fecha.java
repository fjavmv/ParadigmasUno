package com.francisco.javier;

public class Fecha {
    private int dia;
    private int mes;
    private  int year;

    // constructor recibe dia, mes y anio
    public Fecha(int d, int m, int a)
    {
        dia = d;
        mes = m;
        year = a;
    }
    // constructor sin argumentos
    public Fecha()
    {
    }

    public Fecha(String s)
    {
        procesaFecha(s);
    }

    private void procesaFecha(String s){
        // busco la primera ocurrencia de '/'
        int pos1=s.indexOf('/');
        // busco la ultima ocurrencia de '/'
        int pos2=s.lastIndexOf('/');
        // proceso el dia
        String sDia=s.substring(0,pos1);
        dia = Integer.parseInt(sDia);
        // proceso el mes
        String sMes=s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);
        // proceso el anio
        String sYear = s.substring(pos2+1);
        year = Integer.parseInt(sYear);
    }


    //getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //toString
    @Override
    public String toString(){
        return dia +"/"+ mes +"/"+ year;
    }
    // sobrescribimos el metodo equals que heredamos de Object
    @Override
    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (year==otra.year);
    }


}

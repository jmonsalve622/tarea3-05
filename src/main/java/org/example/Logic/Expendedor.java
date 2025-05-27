package org.example.Logic;

public class Expendedor {
    private Deposito<CocaCola> coca;
    private Deposito<Sprite> sprite;
    private Deposito<Fanta> fanta;
    private Deposito<Snickers> snickers;
    private Deposito<Super8> super8;
    private Deposito<Moneda> monVu;

    public Expendedor(int n) {
        coca = new Deposito<CocaCola>(); //Se crea el deposito de CocaCola
        for (int i = 0; i < n; i++) { // Se añaden n CocaCola al deposito
            coca.add(new CocaCola(i + 100));
        }
        sprite = new Deposito<Sprite>(); //Se crea el deposito de Sprite
        for (int i = 0; i < n; i++) { //Se añaden n Sprite al deposito
            sprite.add(new Sprite(i + 200));
        }
        fanta = new Deposito<Fanta>(); //Se crea el deposito de Fanta
        for (int i = 0; i < n; i++) { //Se añaden n Fanta al deposito
            fanta.add(new Fanta(i + 300));
        }
        snickers = new Deposito<Snickers>(); //Se crea el deposito de Snickers
        for (int i = 0; i < n; i++) { //Se añaden n Snickers al deposito
            snickers.add(new Snickers(i + 400));
        }
        super8 = new Deposito<Super8>(); //Se crea el deposito de Super8
        for (int i = 0; i < n; i++) { //Se añaden n Super8 al deposito
            super8.add(new Super8(i + 500));
        }
        monVu = new Deposito<Moneda>(); //Se crea el deposito de Moneda
    }

    private int calcularIter(int valorVuelto) {
        int iter = 0;
        while (valorVuelto > 0) {
            if (valorVuelto - 1000 >= 0) {
                valorVuelto -= 1000;
                iter++;
            }
            else if (valorVuelto - 500 >= 0) {
                valorVuelto -= 500;
                iter++;
            }
            else if (valorVuelto - 100 >= 0) {
                valorVuelto -= 100;
                iter++;
            }
            else {
                break;
            }
        }
        return iter;
    }


    public Producto comprarProducto(Moneda m, Seleccion select) throws RuntimeException {
        if (m == null) { //Si la moneda es un null tira exception
            throw new PagoIncorrectoException();
        }
        int vuelto;
        switch (select) {
            case COCASELECCION:
                if (coca.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.COCAPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                else {
                    vuelto = m.getValor() - Precios.COCAPRECIO.getPrecio();
                }
                return coca.get(); //Retorno del producto
            case SPRITESELECCION:
                if (sprite.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.SPRITEPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                else {
                    vuelto = m.getValor() - Precios.SPRITEPRECIO.getPrecio();
                }
                return sprite.get(); //Retorno del producto
            case FANTASELECCION:
                if (fanta.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.FANTAPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                else {
                    vuelto = m.getValor() - Precios.FANTAPRECIO.getPrecio();
                }
                return fanta.get(); //Retorno del producto
            case SNICKERSSELECCION:
                if (snickers.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.SNICKERSPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                else {
                    vuelto = m.getValor() - Precios.SNICKERSPRECIO.getPrecio();
                }
                return snickers.get(); //Retorno del producto
            case SUPER8SELECCION:
                if (super8.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.SUPER8PRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                else {
                    vuelto = m.getValor() - Precios.SUPER8PRECIO.getPrecio();
                }
                return super8.get(); //Retorno del producto
            default:
                monVu.add(m); //Este default ocurre cuando se selecciona un producto que no existe
                throw new SeleccionFueraDeRangoException();
        }



    }

    public Moneda getVuelto() { //Metodo que devuelve una sola moneda del deposito monVu
        if (!monVu.empty()) {
            return monVu.get();
        }
        else {
            return null;
        }
    }

    public boolean hayVuelto() { //Metodo que retorna true si quedan monedas en el deposito y false si no
        if (!monVu.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
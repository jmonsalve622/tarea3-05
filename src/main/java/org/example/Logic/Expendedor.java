package org.example.Logic;

public class Expendedor {
    private Deposito<CocaCola> coca = new Deposito<CocaCola>();
    private Deposito<Sprite> sprite = new Deposito<Sprite>();
    private Deposito<Fanta> fanta = new Deposito<Fanta>();
    private Deposito<Snickers> snickers = new Deposito<Snickers>();
    private Deposito<Super8> super8 = new Deposito<Super8>();
    private Deposito<Moneda> monVu = new Deposito<Moneda>();
    private Deposito<Moneda> monDep = new Deposito<Moneda>();
    private DepositoEspecial depEsp = new DepositoEspecial();

    public Expendedor(int n) {
        for (int i = 0; i < n; i++) {
            coca.add(new CocaCola(i + 100));
            sprite.add(new Sprite(i + 200));
            fanta.add(new Fanta(i + 300));
            snickers.add(new Snickers(i + 400));
            super8.add(new Super8(i + 500));
        }
    }

    private void agregarVuelto(int valorVuelto) {
        while (valorVuelto > 0) {
            if (valorVuelto - 1000 >= 0) {
                valorVuelto -= 1000;
                monVu.add(new Moneda1000());
            }
            else if (valorVuelto - 500 >= 0) {
                valorVuelto -= 500;
                monVu.add(new Moneda500());
            }
            else if (valorVuelto - 100 >= 0) {
                valorVuelto -= 100;
                monVu.add(new Moneda100());
            }
            else {
                break;
            }
        }
    }

    public void comprarProducto(Moneda m, Seleccion select) throws RuntimeException {
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
                vuelto = m.getValor() - Precios.COCAPRECIO.getPrecio();
                monDep.add(m);
                agregarVuelto(vuelto);
                depEsp.depositarProducto(coca.get());
                break;
            case SPRITESELECCION:
                if (sprite.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.SPRITEPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                monDep.add(m);
                vuelto = m.getValor() - Precios.SPRITEPRECIO.getPrecio();
                agregarVuelto(vuelto);
                depEsp.depositarProducto(sprite.get());
                break;
            case FANTASELECCION:
                if (fanta.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.FANTAPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                monDep.add(m);
                vuelto = m.getValor() - Precios.FANTAPRECIO.getPrecio();
                agregarVuelto(vuelto);
                depEsp.depositarProducto(fanta.get());
                break;
            case SNICKERSSELECCION:
                if (snickers.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.SNICKERSPRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                monDep.add(m);
                vuelto = m.getValor() - Precios.SNICKERSPRECIO.getPrecio();
                agregarVuelto(vuelto);
                depEsp.depositarProducto(snickers.get());
                break;
            case SUPER8SELECCION:
                if (super8.empty()) { //Exception si el deposito esta vacío
                    monVu.add(m);
                    throw new NoHayProductoException();
                }
                if (m.getValor() < Precios.SUPER8PRECIO.getPrecio()) { //Exception si el valor de la moneda es menor a el valor del producto
                    monVu.add(m);
                    throw new PagoInsuficienteException();
                }
                monDep.add(m);
                vuelto = m.getValor() - Precios.SUPER8PRECIO.getPrecio();
                agregarVuelto(vuelto);
                depEsp.depositarProducto(super8.get());
                break;
            default:
                monVu.add(m);
                throw new SeleccionFueraDeRangoException();
        }
    }

    public Producto getProducto() {
        return depEsp.getProducto();
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
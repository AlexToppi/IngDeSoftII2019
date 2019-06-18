/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;
/**
 *
 * @author usuario
 */
public class vpoliza {
    
    public int idpoliza;
    public int monto_total;
    
    public Date fecha_inicio;
    public Date fecha_venc;
    public String cliente_vehiculo_chapaId;
    public int monto_cuota;
    public Date vencimiento_cuota;
    public String  estado_cuota;
   public int poliza_idpoliza;

    public vpoliza(int poliza_idpoliza) {
        this.poliza_idpoliza = poliza_idpoliza;
    }

    public int getPoliza_idpoliza() {
        return poliza_idpoliza;
    }

    public void setPoliza_idpoliza(int poliza_idpoliza) {
        this.poliza_idpoliza = poliza_idpoliza;
    }

    public vpoliza() {
    }

    public vpoliza(int idpoliza, int monto_total, Date fecha_inicio, Date fecha_venc, String cliente_vehiculo_chapaId, int monto_cuota, Date vencimiento_cuota, String estado_cuota) {
        this.idpoliza = idpoliza;
        this.monto_total = monto_total;
        this.fecha_inicio = fecha_inicio;
        this.fecha_venc = fecha_venc;
        this.cliente_vehiculo_chapaId = cliente_vehiculo_chapaId;
        this.monto_cuota = monto_cuota;
        this.vencimiento_cuota = vencimiento_cuota;
        this.estado_cuota = estado_cuota;
    }

    public int getIdpoliza() {
        return idpoliza;
    }

    public void setIdpoliza(int idpoliza) {
        this.idpoliza = idpoliza;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(Date fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public String getCliente_vehiculo_chapaId() {
        return cliente_vehiculo_chapaId;
    }

    public void setCliente_vehiculo_chapaId(String cliente_vehiculo_chapaId) {
        this.cliente_vehiculo_chapaId = cliente_vehiculo_chapaId;
    }

    public int getMonto_cuota() {
        return monto_cuota;
    }

    public void setMonto_cuota(int monto_cuota) {
        this.monto_cuota = monto_cuota;
    }

    public Date getVencimiento_cuota() {
        return vencimiento_cuota;
    }

    public void setVencimiento_cuota(Date vencimiento_cuota) {
        this.vencimiento_cuota = vencimiento_cuota;
    }

    public String getEstado_cuota() {
        return estado_cuota;
    }

    public void setEstado_cuota(String estado_cuota) {
        this.estado_cuota = estado_cuota;
    }

    
}

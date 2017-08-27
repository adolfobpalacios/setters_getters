/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerveza;

/**
 *
 * @author abp392
 */
public class estructura_cerveza {
    
    private String $nombre;
    private String $tipo;
    private int $grado_de_alcohol;
    
    public String getNombre()
    {
        return $nombre;
    }
    public void setNombre(String $nombre)
    {
        this.$nombre = $nombre;
    }
    
    public String getTipo()
    {
        return($tipo);
    }
    public void setTipo(String $tipo)
    {
        this.$tipo = $tipo;
    }
    
    public int getGrado_de_Alcohol()
    {
        return $grado_de_alcohol;
    }
    public void setGrado_de_Alcohol(int $grado_de_alcohol)
    {
        this.$grado_de_alcohol = $grado_de_alcohol;
    }
    
    
    public estructura_cerveza(String $nombre, String $tipo, int $grado_de_alcohol)
    {
        super();
        this.$nombre = $nombre;
        this.$tipo = $tipo;
        this.$grado_de_alcohol = $grado_de_alcohol;
    }
}

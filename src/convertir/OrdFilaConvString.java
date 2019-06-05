/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author usuario
 */
public class OrdFilaConvString extends Converter{
private JTable table;
public JTable getTable()
{
    return table;
}
public void setTable(JTable table)
{
this.table = table;
}
@Override
public Object convertReverse(Object mask)
{
TableRowSorter sorter = new TableRowSorter(table.getModel());
//El siguiente código hace que el filtro sea case sensitive y si queremos //que sea case sensitive, solo hay que descomentar las líneas
//sorter.setRowFilter(RowFilter.regexFilter(".*" + mask + ".*"));
String m = mask.toString();
StringBuilder sb = new StringBuilder();
for (int i = 0; i< m.length();i++)
{
char c = m.charAt(i);
sb.append('[').append(Character.toLowerCase(c)).append(Character.toUpperCase(c)).append(']');
}
sorter.setRowFilter(RowFilter.regexFilter(".*" + sb + ".*"));
return sorter;
}
@Override
public Object convertForward(Object value) {
throw new UnsupportedOperationException("No encontrado.");
}
}

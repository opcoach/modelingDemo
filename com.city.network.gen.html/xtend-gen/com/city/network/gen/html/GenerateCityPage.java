package com.city.network.gen.html;

import com.city.network.City;
import com.city.network.Line;
import com.city.network.Station;
import com.city.network.test.helpers.DefaultCityGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateCityPage {
  public CharSequence generateCityPage(final City c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<title>  Home page for ");
    String _name = c.getName();
    _builder.append(_name, " ");
    _builder.append(" </title>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    {
      EList<Line> _lines = c.getLines();
      for(final Line l : _lines) {
        _builder.append("     ");
        CharSequence _generateHtml = this.generateHtml(l);
        _builder.append(_generateHtml, "     ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateHtml(final Line l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h1> LINE ");
    String _name = l.getName();
    _builder.append(_name);
    _builder.append(" </h1>");
    _builder.newLineIfNotEmpty();
    {
      EList<Station> _stations = l.getStations();
      for(final Station s : _stations) {
        _builder.append("<h2> STATION : ");
        String _name_1 = s.getName();
        _builder.append(_name_1);
        _builder.append(" </h2>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static void main(final String[] args) {
    final City c = DefaultCityGenerator.createDefaultCity();
    final GenerateCityPage gen = new GenerateCityPage();
    CharSequence _generateCityPage = gen.generateCityPage(c);
    String _plus = (" --- Code generated for city  \n" + _generateCityPage);
    System.out.println(_plus);
  }
}

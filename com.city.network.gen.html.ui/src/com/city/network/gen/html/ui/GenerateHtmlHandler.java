
package com.city.network.gen.html.ui;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.city.network.City;
import com.city.network.gen.html.GenerateCityPage;

public class GenerateHtmlHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection isel) {
		Object o = isel.getFirstElement();
		if (o instanceof City)
			execute((City) o);
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) City c) {
		GenerateCityPage gen = new GenerateCityPage();
		String html = gen.generateCityPage(c).toString();
		System.out.println("Generated file : " + html);

		System.out.println("Resource= " + c.eContainer().eResource().getURI().toFileString());

	}

	/** Only click on city can generate HTML code */
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		return (o instanceof City)
				|| (o instanceof IStructuredSelection && ((IStructuredSelection) o).getFirstElement() instanceof City);
	}

}
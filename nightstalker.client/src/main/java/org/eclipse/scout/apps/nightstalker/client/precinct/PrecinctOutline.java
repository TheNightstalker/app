package org.eclipse.scout.apps.nightstalker.client.precinct;

import java.util.List;

import org.eclipse.scout.apps.nightstalker.client.hunter.HunterTablePage;
import org.eclipse.scout.apps.nightstalker.shared.Icons;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

/**
 * @author phohm
 */
@Order(1000)
public class PrecinctOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new HunterTablePage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Precinct");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.CategoryBold;
	}
}

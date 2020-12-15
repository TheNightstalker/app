package org.eclipse.scout.apps.nightstalker.server.hunter;

import org.eclipse.scout.apps.nightstalker.shared.hunter.HunterTablePageData;
import org.eclipse.scout.apps.nightstalker.shared.hunter.IHunterService;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class HunterService implements IHunterService {
	@Override
	public HunterTablePageData getHunterTableData(SearchFilter filter) {
		HunterTablePageData pageData = new HunterTablePageData();
		// TODO [phohm] fill pageData.
		return pageData;
	}
}

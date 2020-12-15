package org.eclipse.scout.apps.nightstalker.shared.hunter;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IHunterService extends IService {
	HunterTablePageData getHunterTableData(SearchFilter filter);
}

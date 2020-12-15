package org.eclipse.scout.apps.nightstalker.client.hunter;

import org.eclipse.scout.apps.nightstalker.client.common.CountryLookupCall;
import org.eclipse.scout.apps.nightstalker.client.hunter.HunterTablePage.Table;
import org.eclipse.scout.apps.nightstalker.shared.hunter.HunterTablePageData;
import org.eclipse.scout.apps.nightstalker.shared.hunter.IHunterService;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractSmartColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

@Data(HunterTablePageData.class)
public class HunterTablePage extends AbstractPageWithTable<Table> {
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Hunters");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IHunterService.class).getHunterTableData(filter));
	}

	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	public class Table extends AbstractTable {

		public FirstNameColumn getFirstNameColumn() {
			return getColumnSet().getColumnByClass(FirstNameColumn.class);
		}

		public CityColumn getCityColumn() {
			return getColumnSet().getColumnByClass(CityColumn.class);
		}

		public CountryColumn getCountryColumn() {
			return getColumnSet().getColumnByClass(CountryColumn.class);
		}

		public EmailColumn getEmailColumn() {
			return getColumnSet().getColumnByClass(EmailColumn.class);
		}

		public StreetColumn getStreetColumn() {
			return getColumnSet().getColumnByClass(StreetColumn.class);
		}

		public HouseNumberColumn getHouseNumberColumn() {
			return getColumnSet().getColumnByClass(HouseNumberColumn.class);
		}

		public ZipColumn getZipColumn() {
			return getColumnSet().getColumnByClass(ZipColumn.class);
		}

		public PhoneColumn getPhoneColumn() {
			return getColumnSet().getColumnByClass(PhoneColumn.class);
		}

		public LastNameColumn getLastNameColumn() {
			return getColumnSet().getColumnByClass(LastNameColumn.class);
		}

		public HunterIdColumn getHunterIdColumn() {
			return getColumnSet().getColumnByClass(HunterIdColumn.class);
		}

		@Order(1000)
		public class HunterIdColumn extends AbstractStringColumn {
			@Override
			protected boolean getConfiguredDisplayable() {
				return false;
			}

			@Override
			protected boolean getConfiguredPrimaryKey() {
				return true;
			}
		}

		@Order(2000)
		public class FirstNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("FirstName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(3000)
		public class LastNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("LastName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(3500)
		public class StreetColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Street");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(3750)
		public class HouseNumberColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("HouseNumber");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3875)
		public class ZipColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("ZipCode");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(4000)
		public class CityColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("City");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(5000)
		public class CountryColumn extends AbstractSmartColumn<String> {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Country");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}

			@Override
			protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
				return CountryLookupCall.class;
			}

		}

		@Order(6000)
		public class PhoneColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Phone");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(7000)
		public class EmailColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("E-Mail");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

	}
}

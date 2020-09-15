package org.ehrbase.numappbackend.opt.openereactcarecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AssessmentSectionContainment extends Containment {
  public SelectAqlField<AssessmentSection> ASSESSMENT_SECTION = new AqlFieldImp<AssessmentSection>(AssessmentSection.class, "", "AssessmentSection", AssessmentSection.class, this);

  public SelectAqlField<SepsisSection> SEPSIS = new AqlFieldImp<SepsisSection>(AssessmentSection.class, "/items[openEHR-EHR-SECTION.adhoc.v1 and name/value='Sepsis']", "sepsis", SepsisSection.class, this);

  public SelectAqlField<DenwisObservation> DENWIS = new AqlFieldImp<DenwisObservation>(AssessmentSection.class, "/items[openEHR-EHR-OBSERVATION.denwis.v0]", "denwis", DenwisObservation.class, this);

  public SelectAqlField<News2Section> NEWS2 = new AqlFieldImp<News2Section>(AssessmentSection.class, "/items[openEHR-EHR-SECTION.adhoc.v1 and name/value='NEWS2']", "news2", News2Section.class, this);

  public SelectAqlField<CovidSection> COVID = new AqlFieldImp<CovidSection>(AssessmentSection.class, "/items[openEHR-EHR-SECTION.adhoc.v1 and name/value='Covid']", "covid", CovidSection.class, this);

  private AssessmentSectionContainment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static AssessmentSectionContainment getInstance() {
    return new AssessmentSectionContainment();
  }
}

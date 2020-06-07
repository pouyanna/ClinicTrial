# This is an auto-generated Django model module.
# You'll have to do the following manually to clean this up:
#   * Rearrange models' order
#   * Make sure each model has one field with primary_key=True
#   * Make sure each ForeignKey and OneToOneField has `on_delete` set to the desired behavior
#   * Remove `managed = False` lines if you wish to allow Django to create, modify, and delete the table
# Feel free to rename the models, but don't rename db_table values or field names.
from django.db import models


class BaselineCounts(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    units = models.TextField(blank=True, null=True)
    scope = models.TextField(blank=True, null=True)
    count = models.IntegerField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'baseline_counts'


class BaselineMeasurements(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    classification = models.TextField(blank=True, null=True) 
    category = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)
    units = models.TextField(blank=True, null=True)
    param_type = models.TextField(blank=True, null=True)
    param_value = models.TextField(blank=True, null=True)
    param_value_num = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_type = models.TextField(blank=True, null=True)
    dispersion_value = models.TextField(blank=True, null=True)
    dispersion_value_num = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_lower_limit = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_upper_limit = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    explanation_of_na = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'baseline_measurements'


class BriefSummaries(models.Model):
    nct = models.OneToOneField('Studies', models.DO_NOTHING, blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'brief_summaries'


class BrowseConditions(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    mesh_term = models.TextField(blank=True, null=True)
    downcase_mesh_term = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'browse_conditions'


class BrowseInterventions(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    mesh_term = models.TextField(blank=True, null=True)
    downcase_mesh_term = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'browse_interventions'


class CalculatedValues(models.Model):
    nct = models.OneToOneField('Studies', models.DO_NOTHING, blank=True, null=True)
    number_of_facilities = models.IntegerField(blank=True, null=True)
    number_of_nsae_subjects = models.IntegerField(blank=True, null=True)
    number_of_sae_subjects = models.IntegerField(blank=True, null=True)
    registered_in_calendar_year = models.IntegerField(blank=True, null=True)
    nlm_download_date = models.DateField(blank=True, null=True)
    actual_duration = models.IntegerField(blank=True, null=True)
    were_results_reported = models.BooleanField(blank=True, null=True)
    months_to_report_results = models.IntegerField(blank=True, null=True)
    has_us_facility = models.BooleanField(blank=True, null=True)
    has_single_facility = models.BooleanField(blank=True, null=True)
    minimum_age_num = models.IntegerField(blank=True, null=True)
    maximum_age_num = models.IntegerField(blank=True, null=True)
    minimum_age_unit = models.TextField(blank=True, null=True)
    maximum_age_unit = models.TextField(blank=True, null=True)
    number_of_primary_outcomes_to_measure = models.IntegerField(blank=True, null=True)
    number_of_secondary_outcomes_to_measure = models.IntegerField(blank=True, null=True)
    number_of_other_outcomes_to_measure = models.IntegerField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'calculated_values'


class Categories(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING)
    name = models.TextField()
    last_modified = models.DateTimeField()
    created_at = models.DateTimeField()
    updated_at = models.DateTimeField()

    class Meta:
        managed = False
        db_table = 'categories'


class CentralContacts(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    contact_type = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    phone = models.TextField(blank=True, null=True)
    email = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'central_contacts'


class Conditions(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    downcase_name = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'conditions'


class Countries(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    removed = models.BooleanField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'countries'


class DesignGroupInterventions(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    design_group = models.ForeignKey('DesignGroups', models.DO_NOTHING, blank=True, null=True)
    intervention = models.ForeignKey('Interventions', models.DO_NOTHING, blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'design_group_interventions'


class DesignGroups(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    group_type = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'design_groups'


class DesignOutcomes(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    outcome_type = models.TextField(blank=True, null=True)
    measure = models.TextField(blank=True, null=True)
    time_frame = models.TextField(blank=True, null=True)
    population = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'design_outcomes'


class Designs(models.Model):
    nct = models.OneToOneField('Studies', models.DO_NOTHING, blank=True, null=True)
    allocation = models.TextField(blank=True, null=True)
    intervention_model = models.TextField(blank=True, null=True)
    observational_model = models.TextField(blank=True, null=True)
    primary_purpose = models.TextField(blank=True, null=True)
    time_perspective = models.TextField(blank=True, null=True)
    masking = models.TextField(blank=True, null=True)
    masking_description = models.TextField(blank=True, null=True)
    intervention_model_description = models.TextField(blank=True, null=True)
    subject_masked = models.BooleanField(blank=True, null=True)
    caregiver_masked = models.BooleanField(blank=True, null=True)
    investigator_masked = models.BooleanField(blank=True, null=True)
    outcomes_assessor_masked = models.BooleanField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'designs'


class DetailedDescriptions(models.Model):
    nct = models.OneToOneField('Studies', models.DO_NOTHING, blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'detailed_descriptions'


class Documents(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    document_id = models.TextField(blank=True, null=True)
    document_type = models.TextField(blank=True, null=True)
    url = models.TextField(blank=True, null=True)
    comment = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'documents'


class DropWithdrawals(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    period = models.TextField(blank=True, null=True)
    reason = models.TextField(blank=True, null=True)
    count = models.IntegerField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'drop_withdrawals'


class Eligibilities(models.Model):
    nct = models.OneToOneField('Studies', models.DO_NOTHING, blank=True, null=True)
    sampling_method = models.TextField(blank=True, null=True)
    gender = models.TextField(blank=True, null=True)
    minimum_age = models.TextField(blank=True, null=True)
    maximum_age = models.TextField(blank=True, null=True)
    healthy_volunteers = models.TextField(blank=True, null=True)
    population = models.TextField(blank=True, null=True)
    criteria = models.TextField(blank=True, null=True)
    gender_description = models.TextField(blank=True, null=True)
    gender_based = models.BooleanField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'eligibilities'


class Facilities(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    status = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    city = models.TextField(blank=True, null=True)
    state = models.TextField(blank=True, null=True)
    zip = models.TextField(blank=True, null=True)
    country = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'facilities'


class FacilityContacts(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    facility = models.ForeignKey(Facilities, models.DO_NOTHING, blank=True, null=True)
    contact_type = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    email = models.TextField(blank=True, null=True)
    phone = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'facility_contacts'


class FacilityInvestigators(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    facility = models.ForeignKey(Facilities, models.DO_NOTHING, blank=True, null=True)
    role = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'facility_investigators'


class IdInformation(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    id_type = models.TextField(blank=True, null=True)
    id_value = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'id_information'


class InterventionOtherNames(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    intervention = models.ForeignKey('Interventions', models.DO_NOTHING, blank=True, null=True)
    name = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'intervention_other_names'


class Interventions(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    intervention_type = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'interventions'


class IpdInformationTypes(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    name = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'ipd_information_types'


class Keywords(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    downcase_name = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'keywords'


class Links(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    url = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'links'


class MeshHeadings(models.Model):
    qualifier = models.TextField(blank=True, null=True)
    heading = models.TextField(blank=True, null=True)
    subcategory = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'mesh_headings'


class MeshTerms(models.Model):
    qualifier = models.TextField(blank=True, null=True)
    tree_number = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)
    mesh_term = models.TextField(blank=True, null=True)
    downcase_mesh_term = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'mesh_terms'


class Milestones(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    period = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)
    count = models.IntegerField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'milestones'


class OutcomeAnalyses(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    outcome = models.ForeignKey('Outcomes', models.DO_NOTHING, blank=True, null=True)
    non_inferiority_type = models.TextField(blank=True, null=True)
    non_inferiority_description = models.TextField(blank=True, null=True)
    param_type = models.TextField(blank=True, null=True)
    param_value = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_type = models.TextField(blank=True, null=True)
    dispersion_value = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    p_value_modifier = models.TextField(blank=True, null=True)
    p_value = models.FloatField(blank=True, null=True)
    ci_n_sides = models.TextField(blank=True, null=True)
    ci_percent = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    ci_lower_limit = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    ci_upper_limit = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    ci_upper_limit_na_comment = models.TextField(blank=True, null=True)
    p_value_description = models.TextField(blank=True, null=True)
    method = models.TextField(blank=True, null=True)
    method_description = models.TextField(blank=True, null=True)
    estimate_description = models.TextField(blank=True, null=True)
    groups_description = models.TextField(blank=True, null=True)
    other_analysis_description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'outcome_analyses'


class OutcomeAnalysisGroups(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    outcome_analysis = models.ForeignKey(OutcomeAnalyses, models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'outcome_analysis_groups'


class OutcomeCounts(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    outcome = models.ForeignKey('Outcomes', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    scope = models.TextField(blank=True, null=True)
    units = models.TextField(blank=True, null=True)
    count = models.IntegerField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'outcome_counts'


class OutcomeMeasurements(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    outcome = models.ForeignKey('Outcomes', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    classification = models.TextField(blank=True, null=True)
    category = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)
    units = models.TextField(blank=True, null=True)
    param_type = models.TextField(blank=True, null=True)
    param_value = models.TextField(blank=True, null=True)
    param_value_num = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_type = models.TextField(blank=True, null=True)
    dispersion_value = models.TextField(blank=True, null=True)
    dispersion_value_num = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_lower_limit = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    dispersion_upper_limit = models.DecimalField(max_digits=65535, decimal_places=65535, blank=True, null=True)
    explanation_of_na = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'outcome_measurements'


class Outcomes(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    outcome_type = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)
    time_frame = models.TextField(blank=True, null=True)
    population = models.TextField(blank=True, null=True)
    anticipated_posting_date = models.DateField(blank=True, null=True)
    anticipated_posting_month_year = models.TextField(blank=True, null=True)
    units = models.TextField(blank=True, null=True)
    units_analyzed = models.TextField(blank=True, null=True)
    dispersion_type = models.TextField(blank=True, null=True)
    param_type = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'outcomes'


class OverallOfficials(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    role = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    affiliation = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'overall_officials'


class ParticipantFlows(models.Model):
    nct = models.OneToOneField('Studies', models.DO_NOTHING, blank=True, null=True)
    recruitment_details = models.TextField(blank=True, null=True)
    pre_assignment_details = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'participant_flows'


class PendingResults(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    event = models.TextField(blank=True, null=True)
    event_date_description = models.TextField(blank=True, null=True)
    event_date = models.DateField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'pending_results'


class ProvidedDocuments(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    document_type = models.TextField(blank=True, null=True)
    has_protocol = models.BooleanField(blank=True, null=True)
    has_icf = models.BooleanField(blank=True, null=True)
    has_sap = models.BooleanField(blank=True, null=True)
    document_date = models.DateField(blank=True, null=True)
    url = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'provided_documents'


class ReportedEvents(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    result_group = models.ForeignKey('ResultGroups', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    time_frame = models.TextField(blank=True, null=True)
    event_type = models.TextField(blank=True, null=True)
    default_vocab = models.TextField(blank=True, null=True)
    default_assessment = models.TextField(blank=True, null=True)
    subjects_affected = models.IntegerField(blank=True, null=True)
    subjects_at_risk = models.IntegerField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)
    event_count = models.IntegerField(blank=True, null=True)
    organ_system = models.TextField(blank=True, null=True)
    adverse_event_term = models.TextField(blank=True, null=True)
    frequency_threshold = models.IntegerField(blank=True, null=True)
    vocab = models.TextField(blank=True, null=True)
    assessment = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'reported_events'


class ResponsibleParties(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    responsible_party_type = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    organization = models.TextField(blank=True, null=True)
    affiliation = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'responsible_parties'


class ResultAgreements(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    pi_employee = models.TextField(blank=True, null=True)
    agreement = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'result_agreements'


class ResultContacts(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    organization = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)
    phone = models.TextField(blank=True, null=True)
    email = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'result_contacts'


class ResultGroups(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    ctgov_group_code = models.TextField(blank=True, null=True)
    result_type = models.TextField(blank=True, null=True)
    title = models.TextField(blank=True, null=True)
    description = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'result_groups'


class Sponsors(models.Model):
    nct = models.ForeignKey('Studies', models.DO_NOTHING, blank=True, null=True)
    agency_class = models.TextField(blank=True, null=True)
    lead_or_collaborator = models.TextField(blank=True, null=True)
    name = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'sponsors'


class Studies(models.Model):
    nct_id = models.TextField(unique=True, blank=True, primary_key=True)
    nlm_download_date_description = models.TextField(blank=True, null=True)
    study_first_submitted_date = models.DateField(blank=True, null=True)
    results_first_submitted_date = models.DateField(blank=True, null=True)
    disposition_first_submitted_date = models.DateField(blank=True, null=True)
    last_update_submitted_date = models.DateField(blank=True, null=True)
    study_first_submitted_qc_date = models.DateField(blank=True, null=True)
    study_first_posted_date = models.DateField(blank=True, null=True)
    study_first_posted_date_type   = models.TextField(blank=True, null=True)
    results_first_submitted_qc_date = models.DateField(blank=True, null=True)
    results_first_posted_date = models.DateField(blank=True, null=True)
    results_first_posted_date_type = models.TextField(blank=True, null=True)
    disposition_first_submitted_qc_date = models.DateField(blank=True, null=True)
    disposition_first_posted_date = models.DateField(blank=True, null=True)
    disposition_first_posted_date_type = models.TextField(blank=True, null=True)
    last_update_submitted_qc_date = models.DateField(blank=True, null=True)
    last_update_posted_date = models.DateField(blank=True, null=True)
    last_update_posted_date_type = models.TextField(blank=True, null=True)
    start_month_year = models.TextField(blank=True, null=True)
    start_date_type = models.TextField(blank=True, null=True)
    start_date = models.DateField(blank=True, null=True)
    verification_month_year = models.TextField(blank=True, null=True)
    verification_date = models.DateField(blank=True, null=True)
    completion_month_year = models.TextField(blank=True, null=True)
    completion_date_type = models.TextField(blank=True, null=True)
    completion_date = models.DateField(blank=True, null=True)
    primary_completion_month_year = models.TextField(blank=True, null=True)
    primary_completion_date_type = models.TextField(blank=True, null=True)
    primary_completion_date = models.DateField(blank=True, null=True)
    target_duration = models.TextField(blank=True, null=True)
    study_type = models.TextField(blank=True, null=True)
    acronym = models.TextField(blank=True, null=True)
    baseline_population = models.TextField(blank=True, null=True)
    brief_title = models.TextField(blank=True, null=True)
    official_title = models.TextField(blank=True, null=True)
    overall_status = models.TextField(blank=True, null=True)
    last_known_status = models.TextField(blank=True, null=True)
    phase = models.TextField(blank=True, null=True)
    enrollment = models.IntegerField(blank=True, null=True)
    enrollment_type = models.TextField(blank=True, null=True)
    source = models.TextField(blank=True, null=True)
    limitations_and_caveats = models.TextField(blank=True, null=True)
    number_of_arms = models.IntegerField(blank=True, null=True)
    number_of_groups = models.IntegerField(blank=True, null=True)
    why_stopped = models.TextField(blank=True, null=True)
    has_expanded_access = models.BooleanField(blank=True, null=True)
    expanded_access_type_individual = models.BooleanField(blank=True, null=True)
    expanded_access_type_intermediate = models.BooleanField(blank=True, null=True)
    expanded_access_type_treatment = models.BooleanField(blank=True, null=True)
    has_dmc = models.BooleanField(blank=True, null=True)
    is_fda_regulated_drug = models.BooleanField(blank=True, null=True)
    is_fda_regulated_device = models.BooleanField(blank=True, null=True)
    is_unapproved_device = models.BooleanField(blank=True, null=True)
    is_ppsd = models.BooleanField(blank=True, null=True)
    is_us_export = models.BooleanField(blank=True, null=True)
    biospec_retention = models.TextField(blank=True, null=True)
    biospec_description = models.TextField(blank=True, null=True)
    ipd_time_frame = models.TextField(blank=True, null=True)
    ipd_access_criteria = models.TextField(blank=True, null=True)
    ipd_url = models.TextField(blank=True, null=True)
    plan_to_share_ipd = models.TextField(blank=True, null=True)
    plan_to_share_ipd_description = models.TextField(blank=True, null=True)
    created_at = models.DateTimeField()
    updated_at = models.DateTimeField()

    class Meta:
        managed = False
        db_table = 'studies'


class StudyReferences(models.Model):
    nct = models.ForeignKey(Studies, models.DO_NOTHING, blank=True, null=True)
    pmid = models.TextField(blank=True, null=True)
    reference_type = models.TextField(blank=True, null=True)
    citation = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'study_references'

package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Item.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "identifier",
        "relation",
        "relation_description",
        "data_page_link",
        "imn_identifier",
        "is_orderable",
        "is_sellable",
        "general_description",
        "is_circular_publish",
        "business_process_status",
        "dpci",
        "department_id",
        "class_id",
        "item_id",
        "online_description",
        "store_description",
        "alternate_description",
        "features"
})
public class Item {

    @JsonProperty("identifier")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    @JsonProperty("relation")
    private String relation;
    @JsonProperty("relation_description")
    private String relationDescription;
    @JsonProperty("data_page_link")
    private String dataPageLink;
    @JsonProperty("imn_identifier")
    private Integer imnIdentifier;
    @JsonProperty("is_orderable")
    private Boolean isOrderable;
    @JsonProperty("is_sellable")
    private Boolean isSellable;
    @JsonProperty("general_description")
    private String generalDescription;
    @JsonProperty("is_circular_publish")
    private Boolean isCircularPublish;
    @JsonProperty("business_process_status")
    private List<BusinessProcessStatu> businessProcessStatus = new ArrayList<BusinessProcessStatu>();
    @JsonProperty("dpci")
    private String dpci;
    @JsonProperty("department_id")
    private Integer departmentId;
    @JsonProperty("class_id")
    private Integer classId;
    @JsonProperty("item_id")
    private Integer itemId;
    @JsonProperty("online_description")
    private OnlineDescription onlineDescription;
    @JsonProperty("store_description")
    private StoreDescription storeDescription;
    @JsonProperty("alternate_description")
    private List<AlternateDescription> alternateDescription = new ArrayList<AlternateDescription>();
    @JsonProperty("features")
    private List<Feature> features = new ArrayList<Feature>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Item() {
    }

    /**
     * Instantiates a new Item.
     *
     * @param identifier            the identifier
     * @param relation              the relation
     * @param relationDescription   the relation description
     * @param dataPageLink          the data page link
     * @param imnIdentifier         the imn identifier
     * @param isOrderable           the is orderable
     * @param isSellable            the is sellable
     * @param generalDescription    the general description
     * @param isCircularPublish     the is circular publish
     * @param businessProcessStatus the business process status
     * @param dpci                  the dpci
     * @param departmentId          the department id
     * @param classId               the class id
     * @param itemId                the item id
     * @param onlineDescription     the online description
     * @param storeDescription      the store description
     * @param alternateDescription  the alternate description
     * @param features              the features
     */
    public Item(List<Identifier> identifier, String relation, String relationDescription, String dataPageLink, Integer imnIdentifier, Boolean isOrderable, Boolean isSellable, String generalDescription, Boolean isCircularPublish, List<BusinessProcessStatu> businessProcessStatus, String dpci, Integer departmentId, Integer classId, Integer itemId, OnlineDescription onlineDescription, StoreDescription storeDescription, List<AlternateDescription> alternateDescription, List<Feature> features) {
        this.identifier = identifier;
        this.relation = relation;
        this.relationDescription = relationDescription;
        this.dataPageLink = dataPageLink;
        this.imnIdentifier = imnIdentifier;
        this.isOrderable = isOrderable;
        this.isSellable = isSellable;
        this.generalDescription = generalDescription;
        this.isCircularPublish = isCircularPublish;
        this.businessProcessStatus = businessProcessStatus;
        this.dpci = dpci;
        this.departmentId = departmentId;
        this.classId = classId;
        this.itemId = itemId;
        this.onlineDescription = onlineDescription;
        this.storeDescription = storeDescription;
        this.alternateDescription = alternateDescription;
        this.features = features;
    }

    /**
     * Gets identifier.
     *
     * @return The identifier
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     *
     * @param identifier The identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets relation.
     *
     * @return The relation
     */
    @JsonProperty("relation")
    public String getRelation() {
        return relation;
    }

    /**
     * Sets relation.
     *
     * @param relation The relation
     */
    @JsonProperty("relation")
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * Gets relation description.
     *
     * @return The relationDescription
     */
    @JsonProperty("relation_description")
    public String getRelationDescription() {
        return relationDescription;
    }

    /**
     * Sets relation description.
     *
     * @param relationDescription The relation_description
     */
    @JsonProperty("relation_description")
    public void setRelationDescription(String relationDescription) {
        this.relationDescription = relationDescription;
    }

    /**
     * Gets data page link.
     *
     * @return The dataPageLink
     */
    @JsonProperty("data_page_link")
    public String getDataPageLink() {
        return dataPageLink;
    }

    /**
     * Sets data page link.
     *
     * @param dataPageLink The data_page_link
     */
    @JsonProperty("data_page_link")
    public void setDataPageLink(String dataPageLink) {
        this.dataPageLink = dataPageLink;
    }

    /**
     * Gets imn identifier.
     *
     * @return The imnIdentifier
     */
    @JsonProperty("imn_identifier")
    public Integer getImnIdentifier() {
        return imnIdentifier;
    }

    /**
     * Sets imn identifier.
     *
     * @param imnIdentifier The imn_identifier
     */
    @JsonProperty("imn_identifier")
    public void setImnIdentifier(Integer imnIdentifier) {
        this.imnIdentifier = imnIdentifier;
    }

    /**
     * Gets is orderable.
     *
     * @return The isOrderable
     */
    @JsonProperty("is_orderable")
    public Boolean getIsOrderable() {
        return isOrderable;
    }

    /**
     * Sets is orderable.
     *
     * @param isOrderable The is_orderable
     */
    @JsonProperty("is_orderable")
    public void setIsOrderable(Boolean isOrderable) {
        this.isOrderable = isOrderable;
    }

    /**
     * Gets is sellable.
     *
     * @return The isSellable
     */
    @JsonProperty("is_sellable")
    public Boolean getIsSellable() {
        return isSellable;
    }

    /**
     * Sets is sellable.
     *
     * @param isSellable The is_sellable
     */
    @JsonProperty("is_sellable")
    public void setIsSellable(Boolean isSellable) {
        this.isSellable = isSellable;
    }

    /**
     * Gets general description.
     *
     * @return The generalDescription
     */
    @JsonProperty("general_description")
    public String getGeneralDescription() {
        return generalDescription;
    }

    /**
     * Sets general description.
     *
     * @param generalDescription The general_description
     */
    @JsonProperty("general_description")
    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }

    /**
     * Gets is circular publish.
     *
     * @return The isCircularPublish
     */
    @JsonProperty("is_circular_publish")
    public Boolean getIsCircularPublish() {
        return isCircularPublish;
    }

    /**
     * Sets is circular publish.
     *
     * @param isCircularPublish The is_circular_publish
     */
    @JsonProperty("is_circular_publish")
    public void setIsCircularPublish(Boolean isCircularPublish) {
        this.isCircularPublish = isCircularPublish;
    }

    /**
     * Gets business process status.
     *
     * @return The businessProcessStatus
     */
    @JsonProperty("business_process_status")
    public List<BusinessProcessStatu> getBusinessProcessStatus() {
        return businessProcessStatus;
    }

    /**
     * Sets business process status.
     *
     * @param businessProcessStatus The business_process_status
     */
    @JsonProperty("business_process_status")
    public void setBusinessProcessStatus(List<BusinessProcessStatu> businessProcessStatus) {
        this.businessProcessStatus = businessProcessStatus;
    }

    /**
     * Gets dpci.
     *
     * @return The dpci
     */
    @JsonProperty("dpci")
    public String getDpci() {
        return dpci;
    }

    /**
     * Sets dpci.
     *
     * @param dpci The dpci
     */
    @JsonProperty("dpci")
    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    /**
     * Gets department id.
     *
     * @return The departmentId
     */
    @JsonProperty("department_id")
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets department id.
     *
     * @param departmentId The department_id
     */
    @JsonProperty("department_id")
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Gets class id.
     *
     * @return The classId
     */
    @JsonProperty("class_id")
    public Integer getClassId() {
        return classId;
    }

    /**
     * Sets class id.
     *
     * @param classId The class_id
     */
    @JsonProperty("class_id")
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * Gets item id.
     *
     * @return The itemId
     */
    @JsonProperty("item_id")
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Sets item id.
     *
     * @param itemId The item_id
     */
    @JsonProperty("item_id")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * Gets online description.
     *
     * @return The onlineDescription
     */
    @JsonProperty("online_description")
    public OnlineDescription getOnlineDescription() {
        return onlineDescription;
    }

    /**
     * Sets online description.
     *
     * @param onlineDescription The online_description
     */
    @JsonProperty("online_description")
    public void setOnlineDescription(OnlineDescription onlineDescription) {
        this.onlineDescription = onlineDescription;
    }

    /**
     * Gets store description.
     *
     * @return The storeDescription
     */
    @JsonProperty("store_description")
    public StoreDescription getStoreDescription() {
        return storeDescription;
    }

    /**
     * Sets store description.
     *
     * @param storeDescription The store_description
     */
    @JsonProperty("store_description")
    public void setStoreDescription(StoreDescription storeDescription) {
        this.storeDescription = storeDescription;
    }

    /**
     * Gets alternate description.
     *
     * @return The alternateDescription
     */
    @JsonProperty("alternate_description")
    public List<AlternateDescription> getAlternateDescription() {
        return alternateDescription;
    }

    /**
     * Sets alternate description.
     *
     * @param alternateDescription The alternate_description
     */
    @JsonProperty("alternate_description")
    public void setAlternateDescription(List<AlternateDescription> alternateDescription) {
        this.alternateDescription = alternateDescription;
    }

    /**
     * Gets features.
     *
     * @return The features
     */
    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    /**
     * Sets features.
     *
     * @param features The features
     */
    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    /**
     * Gets additional properties.
     *
     * @return the additional properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Sets additional property.
     *
     * @param name  the name
     * @param value the value
     */
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

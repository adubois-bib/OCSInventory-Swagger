/* 
 * OCS Inventory Rest API
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// ComputersListComputerIdBios
    /// </summary>
    [DataContract]
        public partial class ComputersListComputerIdBios :  IEquatable<ComputersListComputerIdBios>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComputersListComputerIdBios" /> class.
        /// </summary>
        /// <param name="aSSETTAG">aSSETTAG.</param>
        /// <param name="bDATE">bDATE.</param>
        /// <param name="bMANUFACTURER">bMANUFACTURER.</param>
        /// <param name="bVERSION">bVERSION.</param>
        /// <param name="hARDWAREID">hARDWAREID.</param>
        /// <param name="mMANUFACTURER">mMANUFACTURER.</param>
        /// <param name="mMODEL">mMODEL.</param>
        /// <param name="mSN">mSN.</param>
        /// <param name="sMANUFACTURER">sMANUFACTURER.</param>
        /// <param name="sMODEL">sMODEL.</param>
        /// <param name="sSN">sSN.</param>
        /// <param name="tYPE">tYPE.</param>
        public ComputersListComputerIdBios(string aSSETTAG = default(string), string bDATE = default(string), string bMANUFACTURER = default(string), string bVERSION = default(string), int? hARDWAREID = default(int?), string mMANUFACTURER = default(string), string mMODEL = default(string), string mSN = default(string), string sMANUFACTURER = default(string), string sMODEL = default(string), string sSN = default(string), string tYPE = default(string))
        {
            this.ASSETTAG = aSSETTAG;
            this.BDATE = bDATE;
            this.BMANUFACTURER = bMANUFACTURER;
            this.BVERSION = bVERSION;
            this.HARDWARE_ID = hARDWAREID;
            this.MMANUFACTURER = mMANUFACTURER;
            this.MMODEL = mMODEL;
            this.MSN = mSN;
            this.SMANUFACTURER = sMANUFACTURER;
            this.SMODEL = sMODEL;
            this.SSN = sSN;
            this.TYPE = tYPE;
        }
        
        /// <summary>
        /// Gets or Sets ASSETTAG
        /// </summary>
        [DataMember(Name="ASSETTAG", EmitDefaultValue=false)]
        public string ASSETTAG { get; set; }

        /// <summary>
        /// Gets or Sets BDATE
        /// </summary>
        [DataMember(Name="BDATE", EmitDefaultValue=false)]
        public string BDATE { get; set; }

        /// <summary>
        /// Gets or Sets BMANUFACTURER
        /// </summary>
        [DataMember(Name="BMANUFACTURER", EmitDefaultValue=false)]
        public string BMANUFACTURER { get; set; }

        /// <summary>
        /// Gets or Sets BVERSION
        /// </summary>
        [DataMember(Name="BVERSION", EmitDefaultValue=false)]
        public string BVERSION { get; set; }

        /// <summary>
        /// Gets or Sets HARDWARE_ID
        /// </summary>
        [DataMember(Name="HARDWARE_ID", EmitDefaultValue=false)]
        public int? HARDWARE_ID { get; set; }

        /// <summary>
        /// Gets or Sets MMANUFACTURER
        /// </summary>
        [DataMember(Name="MMANUFACTURER", EmitDefaultValue=false)]
        public string MMANUFACTURER { get; set; }

        /// <summary>
        /// Gets or Sets MMODEL
        /// </summary>
        [DataMember(Name="MMODEL", EmitDefaultValue=false)]
        public string MMODEL { get; set; }

        /// <summary>
        /// Gets or Sets MSN
        /// </summary>
        [DataMember(Name="MSN", EmitDefaultValue=false)]
        public string MSN { get; set; }

        /// <summary>
        /// Gets or Sets SMANUFACTURER
        /// </summary>
        [DataMember(Name="SMANUFACTURER", EmitDefaultValue=false)]
        public string SMANUFACTURER { get; set; }

        /// <summary>
        /// Gets or Sets SMODEL
        /// </summary>
        [DataMember(Name="SMODEL", EmitDefaultValue=false)]
        public string SMODEL { get; set; }

        /// <summary>
        /// Gets or Sets SSN
        /// </summary>
        [DataMember(Name="SSN", EmitDefaultValue=false)]
        public string SSN { get; set; }

        /// <summary>
        /// Gets or Sets TYPE
        /// </summary>
        [DataMember(Name="TYPE", EmitDefaultValue=false)]
        public string TYPE { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComputersListComputerIdBios {\n");
            sb.Append("  ASSETTAG: ").Append(ASSETTAG).Append("\n");
            sb.Append("  BDATE: ").Append(BDATE).Append("\n");
            sb.Append("  BMANUFACTURER: ").Append(BMANUFACTURER).Append("\n");
            sb.Append("  BVERSION: ").Append(BVERSION).Append("\n");
            sb.Append("  HARDWARE_ID: ").Append(HARDWARE_ID).Append("\n");
            sb.Append("  MMANUFACTURER: ").Append(MMANUFACTURER).Append("\n");
            sb.Append("  MMODEL: ").Append(MMODEL).Append("\n");
            sb.Append("  MSN: ").Append(MSN).Append("\n");
            sb.Append("  SMANUFACTURER: ").Append(SMANUFACTURER).Append("\n");
            sb.Append("  SMODEL: ").Append(SMODEL).Append("\n");
            sb.Append("  SSN: ").Append(SSN).Append("\n");
            sb.Append("  TYPE: ").Append(TYPE).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ComputersListComputerIdBios);
        }

        /// <summary>
        /// Returns true if ComputersListComputerIdBios instances are equal
        /// </summary>
        /// <param name="input">Instance of ComputersListComputerIdBios to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComputersListComputerIdBios input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ASSETTAG == input.ASSETTAG ||
                    (this.ASSETTAG != null &&
                    this.ASSETTAG.Equals(input.ASSETTAG))
                ) && 
                (
                    this.BDATE == input.BDATE ||
                    (this.BDATE != null &&
                    this.BDATE.Equals(input.BDATE))
                ) && 
                (
                    this.BMANUFACTURER == input.BMANUFACTURER ||
                    (this.BMANUFACTURER != null &&
                    this.BMANUFACTURER.Equals(input.BMANUFACTURER))
                ) && 
                (
                    this.BVERSION == input.BVERSION ||
                    (this.BVERSION != null &&
                    this.BVERSION.Equals(input.BVERSION))
                ) && 
                (
                    this.HARDWARE_ID == input.HARDWARE_ID ||
                    (this.HARDWARE_ID != null &&
                    this.HARDWARE_ID.Equals(input.HARDWARE_ID))
                ) && 
                (
                    this.MMANUFACTURER == input.MMANUFACTURER ||
                    (this.MMANUFACTURER != null &&
                    this.MMANUFACTURER.Equals(input.MMANUFACTURER))
                ) && 
                (
                    this.MMODEL == input.MMODEL ||
                    (this.MMODEL != null &&
                    this.MMODEL.Equals(input.MMODEL))
                ) && 
                (
                    this.MSN == input.MSN ||
                    (this.MSN != null &&
                    this.MSN.Equals(input.MSN))
                ) && 
                (
                    this.SMANUFACTURER == input.SMANUFACTURER ||
                    (this.SMANUFACTURER != null &&
                    this.SMANUFACTURER.Equals(input.SMANUFACTURER))
                ) && 
                (
                    this.SMODEL == input.SMODEL ||
                    (this.SMODEL != null &&
                    this.SMODEL.Equals(input.SMODEL))
                ) && 
                (
                    this.SSN == input.SSN ||
                    (this.SSN != null &&
                    this.SSN.Equals(input.SSN))
                ) && 
                (
                    this.TYPE == input.TYPE ||
                    (this.TYPE != null &&
                    this.TYPE.Equals(input.TYPE))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ASSETTAG != null)
                    hashCode = hashCode * 59 + this.ASSETTAG.GetHashCode();
                if (this.BDATE != null)
                    hashCode = hashCode * 59 + this.BDATE.GetHashCode();
                if (this.BMANUFACTURER != null)
                    hashCode = hashCode * 59 + this.BMANUFACTURER.GetHashCode();
                if (this.BVERSION != null)
                    hashCode = hashCode * 59 + this.BVERSION.GetHashCode();
                if (this.HARDWARE_ID != null)
                    hashCode = hashCode * 59 + this.HARDWARE_ID.GetHashCode();
                if (this.MMANUFACTURER != null)
                    hashCode = hashCode * 59 + this.MMANUFACTURER.GetHashCode();
                if (this.MMODEL != null)
                    hashCode = hashCode * 59 + this.MMODEL.GetHashCode();
                if (this.MSN != null)
                    hashCode = hashCode * 59 + this.MSN.GetHashCode();
                if (this.SMANUFACTURER != null)
                    hashCode = hashCode * 59 + this.SMANUFACTURER.GetHashCode();
                if (this.SMODEL != null)
                    hashCode = hashCode * 59 + this.SMODEL.GetHashCode();
                if (this.SSN != null)
                    hashCode = hashCode * 59 + this.SSN.GetHashCode();
                if (this.TYPE != null)
                    hashCode = hashCode * 59 + this.TYPE.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}

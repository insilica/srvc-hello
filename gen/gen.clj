#!/usr/bin/env bb

(require '[babashka.deps :as deps])

(deps/add-deps '{:deps {co.insilica/bb-srvc {:mvn/version "0.4.0"}}})

(require '[srvc.bb :as sb])

(def docs
  [{:data {:title "Final report of the amended safety assessment of sodium laureth sulfate and related salts of sulfated ethoxylated alcohols"
           :abstract "Sodium laureth sulfate is a member of a group of salts of sulfated ethoxylated alcohols, the safety of which was evaluated by the Cosmetic Ingredient Review (CIR) Expert Panel for use in cosmetics. Sodium and ammonium laureth sulfate have not evoked adverse responses in any toxicological testing. Sodium laureth sulfate was demonstrated to be a dermal and ocular irritant but not a sensitizer. The Expert Panel recognized that there are data gaps regarding use and concentration of these ingredients. However, the overall information available on the types of products in which these ingredients are used and at what concentrations indicates a pattern of use. The potential to produce irritation exists with these salts of sulfated ethoxylated alcohols, but in practice they are not regularly seen to be irritating because of the formulations in which they are used. These ingredients should be used only when they can be formulated to be nonirritating."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/20634505/"}
   {:data {:title "Anatomical location differences in sodium lauryl sulfate‐induced irritation
"
           :abstract "Sodium lauryl sulfate (SLS)-induced contact dermatitis is a commonly used model for testing the effects of different topical formulations. According to the guidelines, the volar forearms are the preferred testing site; however, other anatomical locations have been used in previous research, particularly the upper back as the clinically used site for testing different antigens."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/31259392/"}
   {:data {:title "Effect of a botanical cleansing lotion on skin sebum and erythema of the face: A randomized controlled blinded half-side comparison"
           :abstract "Background: Elevated levels of skin sebum are associated with the growth of Propionibacterium acnes. Intensive degreasing of the skin reduces Propionibacterium acnes but also may cause skin irritation.

Aims: We assessed the degreasing effect and skin tolerability of a botanical face cleanser with hops and willow bark extract and disodium cocoyl glutamate as mild cleansing agent compared to a standard face cleanser with sodium laureth sulfate (SLES).

Materials and methods: A total of 21 healthy volunteers with normal to oily skin were enrolled in this study. Both cleansers were applied twice a day on the left or right side of the forehead for 15 days in a standardized manner. Bioengineering measurements were performed on day 8 and 15 and on day 17 after an application break of 48 hours. The sebum level was determined using a Sebumeter® , and skin redness was measured using a Mexameter® .

Results: The botanical face cleanser significantly reduced the sebum level (P < .01) in the test area on day 17. The SLES containing cleanser showed a statistically relevant degreasing effect already on day 15, but after the application break the sebum level increased again on day 17. None of the cleansers caused skin irritation as determined by skin redness measurements.

Conclusions: In contrast to the SLES containing cleanser, the botanical skin cleanser with hops and willow bark extract had a continuous degreasing effect without reactive seborrhoe after the treatment break. Skin cleansing without SLES might be advantageous for sensitive skin.

Keywords: Mexameter; Sebumeter; acne; degreasing; face cleanser."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/30022595/"}
   {:data {:title "Irritant and sensitizing potential of eight surfactants commonly used in skin cleansers: an evaluation of 105 patients
"
           :abstract "Background: Irritation from surfactants contained in detergents is a frequent adverse reaction to cosmetics. Sensitization to surfactants is also possible. In the literature, comparative studies about irritant and sensitizing potential of different surfactants are heterogeneous and inconclusive about the best molecules to use.

Objectives: We compared the irritant and sensitizing potential of some surfactants that are usual components in marketed synthetic detergents (syndets) to obtain practical information regarding commonly used detergents.

Methods: We patch-tested eight surfactants of the different types (anionic, cationic, amphoteric, and non-ionic) in 105 patients. Assessment of allergic reactions of tested surfactants was carried out in accordance with the recommendations of the International Contact Dermatitis Research Group; assessment of irritant power followed the amended Draize classification.

Results: None of the eight surfactants in our series gave positive allergic reactions. Only cocamidopropyl betaine from the Italian standard (Società Italiana di Dermatologia Allergologica, Professionale e Ambientale [SIDAPA]) series gave five positive reactions among 105 patients. None of the eight studied surfactants induced skin irritation. The most tolerated are two new mild anionics (sodium cocoyl glutamate and sodium lauroyl oat amino acids) and an amphoteric agent (disodium cocoamphodiacetate).

Conclusion: From this study, we deduce that cosmetic companies' efforts to search for and market new products with very mild surfactants have been generally successful."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/20920412/"}
   {:data {:title "Decyl Glucoside Synthesized by Direct Glucosidation of D-Glucose Over Zeolite Catalysts and Its Estrogenicity as Non-Endocrine Disruptive Surfactant"
           :abstract "The estrogenicity of decyl glucoside was asserted as a non-endocrine disruptive surfactant with its preparation method using zeolite catalysts. Its estrogenicity was estimated using E-assay method. The decyl glucoside was synthesized by direct glucosidation from D-glucose with 1-decanol. The conversion and yield were improved with increasing of amount of acid sites of the zeolite catalysts. The decyl glucopyranoside is more hydrophilic than nonylphenol and has a high wettability. The decyl glucopyranosides exhibited extremely lower proliferation of estrogenic cell compared with nonylphenol."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/30360227/"}
   {:data {:title "Safety assessment of decyl glucoside and other alkyl glucosides as used in cosmetics
"
           :abstract "The Cosmetic Ingredient Review (CIR) Expert Panel assessed the safety of 19 alkyl glucosides as used in cosmetics and concluded that these ingredients are safe in the present practices of use and concentration when formulated to be nonirritating. Most of these ingredients function as surfactants in cosmetics, but some have additional functions as skin-conditioning agents, hair-conditioning agents, or emulsion stabilizers. The Panel reviewed the available animal and clinical data on these ingredients. Since glucoside hydrolases in human skin are likely to break down these ingredients to release their respective fatty acids and glucose, the Panel also reviewed CIR reports on the safety of fatty alcohols and were able to extrapolate data from those previous reports to support safety."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/24174472/"}
   {:data {:title "Allergic contact dermatitis caused by benzoic acid and lauryl glucoside in a sunscreen"}
    :uri "https://pubmed.ncbi.nlm.nih.gov/28766797/"}
   {:data {:title "A new formula for a mild body cleanser: sodium laureth sulphate supplemented with sodium laureth carboxylate and lauryl glucoside"
           :abstract "Objective: Sodium laureth sulphate (SLES) is an anionic detergent, which has been used globally for personal care products because of its mildness and good foaming ability. However, SLES is somewhat invasive and stimulatory to the skin, and many consumers with sensitive skin desire milder detergents for daily use skin cleansers. We enhanced the mildness of SLES by formulating it with sodium laureth carboxylate (AEC) and lauryl glucoside (LG).

Methods: In skin soak tests, 5% detergent solutions were applied to the forearms of 10 Japanese healthy volunteers for 30 min followed by washing with tap water once a day for 4 days. Twenty-four hours after the last treatment, cutaneous capacitance measurements and visual analyses were performed. In a controlled usage study, 16 Japanese healthy volunteers used the test body cleanser for 4 weeks. Assessment of efficacy and mildness was conducted prior to the start of the study and at the end of week 4 by cutaneous conductance, dermoscopic evaluation of the stratum corneum and visual assessment by a dermatologist.

Results: In soak tests, cutaneous capacitance was significantly decreased on the soap-treated region and on the SLES-treated region. No significant decrease was identified on the SLES/AEC/LG-treated region with less induction of erythema or dryness. In the controlled usage study, no significant changes in cutaneous conductance or texture or damage of corneocytes on the forearm and lower thigh were found. However, visual assessment revealed a significant decrease in scaling and erythema on the lower thigh after 4 weeks of usage with an improvement of the discomfort of the consumer. The favourability rating of this formulated detergent in several questionnaire items was very good.

Conclusion: The newly formulated skin cleanser with the combination of anionic surfactants SLES and AEC and the non-ionic surfactant LG provides a mild surfactant with a satisfactory cleansing activity for body washing.

Keywords: care; formulation; moisturization; safety testing."}
    :uri "https://pubmed.ncbi.nlm.nih.gov/24617572/"}])

(sb/generate
 (map #(sb/add-hash (assoc % :type "document")) docs))

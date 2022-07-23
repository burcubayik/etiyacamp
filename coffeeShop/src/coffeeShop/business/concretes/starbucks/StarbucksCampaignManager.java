package coffeeShop.business.concretes.starbucks;

import java.util.List;

import javax.wsdl.Message;

import coffeeShop.business.abstracts.CampaignService;
import coffeeShop.business.constants.Messages;
import coffeeShop.dataAccess.abstracts.CampaignRepository;
import coffeeShop.entities.concretes.Campaign;

public class StarbucksCampaignManager implements CampaignService {
	private CampaignRepository campaignRepository;
	
	public StarbucksCampaignManager(CampaignRepository campaignRepository) {
		this.campaignRepository= campaignRepository;
		
	}

	@Override
	public void add(Campaign campaign) {
		campaignRepository.add(campaign);
		System.out.println(Messages.added);
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return campaignRepository.getAll();
	}

	@Override
	public Campaign getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
